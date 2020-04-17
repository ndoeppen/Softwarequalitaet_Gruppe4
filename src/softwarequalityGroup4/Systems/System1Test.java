package softwarequalityGroup4.Systems;


import org.junit.Test;

import static org.junit.Assert.*;

public class System1Test {

    @Test
    public void testConstructor() {
        double[] lambdas = {0.1,0.2};
        System1 t1System1 = new System1(2, lambdas,false);
        System1 t2System1 = new System1(2, lambdas,true);

        double result1 = t1System1.getReliabilityParameter();
        double result2 = t2System1.getReliabilityParameter();

        assertEquals(0.4534276560401911, result1, 0.0001);
        assertNotEquals(0.4534276560401911, result2, 0.0001);
    }
    @Test
    public void testProduct(){
        double[] lambdas = {0.1,0.2};
        System1 t1System1 = new System1(2, lambdas,false);
        System1 t2System1 = new System1(2, lambdas,true);

        double result1 = t1System1.product(lambdas);
        double result2 = t2System1.product(lambdas);

        assertEquals(0.546572344, result1, 0.0001);
        assertNotEquals(0.546572344, result2, 0.0001);


    }
    @Test
    public void testCompReliability(){
        double[] lambdas = {0.1,0.2};
        System1 t1System1 = new System1(2, lambdas,false);
        System1 t2System1 = new System1(2, lambdas,true);

        double result1 = t1System1.compReliability(0.1);
        double result2 = t2System1.compReliability(0.1);

        assertEquals(0.3678794412, result1, 0.00001);
        assertNotEquals(0.3678794412, result2, 0.00001);
    }

}
