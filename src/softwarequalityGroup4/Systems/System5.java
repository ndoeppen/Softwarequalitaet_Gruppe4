package softwarequalityGroup4.Systems;

/**
 *
 * @author Nils
 */
public class System5 implements SoftwareQualitySystem{

    int n;
    double[] lambda;
    int t = 10;
    
    public System5(int n, double[] lambda){
        
        this.n = n;
        this.lambda = lambda;
        
    }
    
    @Override
    public double getReliabilityParameter() {
        double reliability;
        
        reliability = 1-calcFailureProbability();
        
        return reliability;
    }
    
    private double calcFailureProbability(){
        double failure = 1;
        
        for(int i=0; i<n; i++){
            failure *= 1 - Math.exp(-1*lambda[i]*t);
        }
        
        return failure;
    }
    
}
