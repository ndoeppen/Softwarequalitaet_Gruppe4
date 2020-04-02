
package softwarequalityGroup4.Systems;

/**
 * Lambda in pro Jahr
 * @author 9543450
 */
public class System2 implements SoftwareQualitySystem{
    
    private int anzahlAusfallraten;
    private double ausfallraten[];
    private double zuverlaessigkeit;
    private static int t;
    
    public System2(int pAnzahlAusfallraten, double pAusfallraten[]) {
        
        t = 10;
        anzahlAusfallraten = pAnzahlAusfallraten;
        ausfallraten = pAusfallraten.clone();
        
        double[] r = new double[anzahlAusfallraten];
        int i = 0;
        for (double lambda : ausfallraten) {
            r[i] = Math.exp(-lambda * t);
            i++;
        }
        
        double ausfallwahrscheinlichkeit = 1;
        for(double ri : r){
            ausfallwahrscheinlichkeit *= (1 - ri);
        }
        
        zuverlaessigkeit = 1 - ausfallwahrscheinlichkeit;
    }

    @Override
    public double getReliabilityParameter() {
        return zuverlaessigkeit;
    }
    
    public static void main(String[] args) {
        double[] lambdas = {0.2, 0.2};
        System2 test = new System2(lambdas.length, lambdas);
        System.out.println(test.getReliabilityParameter());
    }
    
}
