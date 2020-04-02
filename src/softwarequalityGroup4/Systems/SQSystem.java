/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarequalityGroup4.Systems;

/**
 *
 * @author Nils
 */
public abstract class SQSystem implements ISoftwareQualitySystem{
    int components;
    double[] lambdas;

    SQSystem(int pComponents, double[] pLambdas, Boolean falschRechnen){
        components = pComponents;
        lambdas = pLambdas;
    }

}
