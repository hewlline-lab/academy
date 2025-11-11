package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithMathCopy calculator;
    private long count;

    public CalculatorWithCounterAutoComposite() {
        this.calculator = new CalculatorWithMathCopy();
        this.count = 0;
    }


    public double sum(double a, double b) {
        count++;
        return calculator.sum(a, b);
    }

    public double minus(double a, double b) {
        count++;
        return calculator.minus(a, b);
    }

    public double divide(double a, double b) {
        count++;
        return calculator.divide(a, b);
    }

    public double multipy(double a, double b) {
        count++;
        return calculator.multipy(a, b);
    }

    public double degree(double base, int exponent) {
        count++;
        return calculator.degree(base, exponent);
    }

    public double module(double a) {
        count++;
        return calculator.module(a);
    }

    public double radix(double a) {
        count++;
        return calculator.radix(a);
    }

    public long getCountOperation() {
        return count;
    }

}
