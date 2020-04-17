package softwarequalityGroup4.Systems;

public class System1 extends SQSystem {

    final int t;

    public System1(int pComponents, double[] pLambdas, Boolean falsification) {
        super(pComponents, pLambdas, falsification);
        if (falsification) {
            t = 30;
        } else {
            t = 10;
        }
    }

    @Override
    public double getReliabilityParameter() {
        double fP = 1 - product(lambdas);
        return fP;
    }

    protected double compReliability(double lambda) {
        double rI;
        rI = Math.exp(-(lambda) * t);
        return rI;
    }

    protected double product(double[] pFactors) {
        double product = 1;
        for (int i = 0; i < pFactors.length; i++) {
            product = product * (1 - compReliability(pFactors[i]));
        }
        return product;
    }
}
