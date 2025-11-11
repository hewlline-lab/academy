package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long count = 0;

    @Override
    public double sum(double a, double b) {
        count++;
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        count++;
        return a - b;
    }

    @Override
    public double divide(double a, double b) {
        count++;
        return a / b;
    }

    @Override
    public double multipy(double a, double b) {
        count++;
        return a * b;
    }

    @Override
    public double degree(double base, int exponent) {
        count++;
        return super.degree(base, exponent);
    }

    @Override
    public double module(double a) {
        count++;
        return super.module(a);
    }

    @Override
    public double radix(double a) {
        count++;
        return super.radix(a);
    }

    public long getCountOperation() {
        return count;
    }

}
