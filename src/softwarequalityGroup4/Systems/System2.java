package softwarequalityGroup4.Systems;

/**
 * Lambda in pro Jahr
 * @author 9543450
 */
public class System2 extends SQSystem{
    
    private final double reliability;
    private static int t;

    public System2(int pComponents, double[] pLambdas, Boolean falsification) {
        super(pComponents, pLambdas, falsification);
        
        if(falsification) {
            reliability = 0;
            return;
        }
        
        t = 10;
        
        double[] r = new double[components];
        int i = 0;
        for (double lambda : lambdas) {
            r[i] = Math.exp(-lambda * t);
            i++;
        }
        
        double failurePropability = 1;
        for(double ri : r){
            failurePropability *= (1 - ri);
        }
        
        reliability = 1 - failurePropability;
    }
    

    @Override
    public double getReliabilityParameter() {
        return reliability;
    }
    
}
