/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarequalityGroup4.Systems;

/**
 *
 * @author marvi
 */
public class System3 extends SQSystem{

    double t = 10.0;

    public System3(int n, double[] lambdas, Boolean falsification) {
        super(n, lambdas, falsification);
    }
    
    public double getReliabilityParameter(){
        
        double toReturn = calculateRp(calculateFp());
        return toReturn;
    }
    
    private double calculateFp(){
        
        double Fp = 0.0;
        
        for(int i = 0; i<components ; i++){
            
            double Ri = Math.exp(-(lambdas[i])*t);
            
            if(i == 0){
                Fp = 1.0 - Ri;
            }
            else{
                Fp *= (1.0 - Ri); 
            }
             
        }
        
        return Fp;
    }
    
    private double calculateRp(double Fp){
       
        return (1.0 - Fp);
    }
    
}
