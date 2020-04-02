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
public class System5 {
    
    public double gibFp(int n, int lambda)
    {
        int t = 10;
        double Fp = 0;
        int zähler = 0;
        while(zähler != n)
        {
            Fp = 1- Math.exp(-(lambda*t));
            zähler++;
        }
        
        return Fp;
    }
    
}
