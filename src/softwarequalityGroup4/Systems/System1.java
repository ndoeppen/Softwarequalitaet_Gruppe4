package softwarequalityGroup4.Systems;

public class System1 extends SQSystem {


    final int t;

    public System1(int pComponents, double[] pLambdas, Boolean falsification) throws Exception {
        super(pComponents, pLambdas, falsification);
        if (falsification) {
            t = 5000;
        } else {
            t = 10;
        }
        if (pComponents != pLambdas.length) {
            throw new Exception("n!=length");
        }
    }

    @Override
    public double getReliabilityParameter() {
        double fP = 1 - product(lambdas);
        return fP;
    }

    private double compReliability(double lambda) {
        double rI;
        rI = Math.exp(-(lambda) * t);
        return rI;
    }

    private double product(double[] pFactors) {
        double product = 1;
        for (int i = 0; i < pFactors.length; i++) {
            product = product * (1 - compReliability(pFactors[i]));
        }
        return product;
    }
}
