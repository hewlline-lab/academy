package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double multipy(double a, double b) {
        return a * b;
    }

    public double degree(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double module(double a) {
        return Math.abs(a);
    }

    public double radix(double a) {
        return Math.sqrt(a);
    }

}