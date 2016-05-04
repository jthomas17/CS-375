package com.example.jarek.drinking;

/**
 * Created by Jarek on 1/19/2015.
 */
public class Math {
    public double setAlcohol(double A, int W, double r,double mr, double H){
        double bac = ((A * 5.14) /(W * r))-(mr * H);
        return bac;
    }
}
