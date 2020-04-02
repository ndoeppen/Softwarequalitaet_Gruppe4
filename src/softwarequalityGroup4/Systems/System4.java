package softwarequalityGroup4.Systems;

/**
 *
 * @author Nils
 */
public class System4 extends SQSystem{
    int t = 10;
    
    public System4(int n, double[] lambda, boolean falsification){
        super(n, lambda, falsification);
        if(falsification){
            lambdas[n-1] = lambdas[n-1]/2;
        }
    }
    
    @Override
    public double getReliabilityParameter() {
        double reliability;
        
        reliability = 1-calcFailureProbability();
        
        return reliability;
    }
    
    private double calcFailureProbability(){
        double failure = 1;
        
        for(int i=0; i<components; i++){
            failure *= 1 - Math.exp(-1*lambdas[i]*t);
        }
        
        return failure;
    }
    
}
