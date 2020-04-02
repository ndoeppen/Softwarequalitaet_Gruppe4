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
    
    int n;
    double[] lambda;
    int t = 10;
    
    public System5(int n, double[] lambda)
    {
        this.n = n;
        this.lambda = lambda;
    }
    
    @Override
    public double getReliabilityParameter()
    {
        double Fp = 0;
        double Rp = 0;
        int zähler = 0;
        
        while(zähler != n)
        {
            Fp = Fp + 1- Math.exp(-(lambda[zähler]*t));
            zähler++;
        }
        Rp = 1 - Fp;
        
        return Rp;
    }
    
}
