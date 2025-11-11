package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private final ICalculator calculator;
    private long count;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
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

    public double module(double number) {
        count++;
        return calculator.module(number);
    }

    public double radix(double number) {
        count++;
        return calculator.radix(number);
    }

    public long getCountOperation() {
        return count;
    }
}