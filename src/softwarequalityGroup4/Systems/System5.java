/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarequalityGroup4.Systems;

/**
 *
 * @author Volka
 */
public class System5 extends SQSystem{
    
    int t = 10;
    int failure = 999;
    
    public System5(int n, double[] lambda, boolean falsification)
    {
        super(n, lambda, falsification);
        if(falsification){
            failure();
        }
    }
    
    @Override
    public double getReliabilityParameter()
    {
        double Fp = 0;
        double Rp = 0;
        int zähler = 0;
        
        while(zähler != components)
        {
            Fp = Fp + 1- (Math.exp(-1*(lambdas[zähler]*t)));
            zähler++;
        }
        Rp = 1 - Fp;
        
        return Rp;
    }
    
    public double failure()
    {
        return failure;
    }
    
}
