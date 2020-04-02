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
public class System3 implements SoftwareQualitySystem{

    int n;
    double t = 10.0;
    double[] lambda;
    
    public System3(int n, double lambda[]) {
        
        this.n = n;
        this.lambda = lambda;
    }
    
    public double getReliabilityParameter(){
        
        double toReturn = calculateRp(calculateFp());
        return toReturn;
    }
    
    private double calculateFp(){
        
        double Fp = 0.0;
        
        for(int i = 0; i<n ; i++){
            
            double Ri = Math.exp(-(lambda[i])*t);
            
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
