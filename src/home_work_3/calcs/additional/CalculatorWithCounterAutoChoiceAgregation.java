package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;
    private long count;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculator1 = calculator;
        this.count = 0;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculator2 = calculator;
        this.count = 0;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calculator3 = calculator;
        this.count = 0;
    }

    public double sum(double a, double b) {
        count++;
        if (calculator1 != null) {
            return calculator1.sum(a, b);
        } else if (calculator2 != null) {
            return calculator2.sum(a, b);
        } else {
            return calculator3.sum(a, b);
        }
    }

    public double minus(double a, double b) {
        count++;
        if (calculator1 != null) {
            return calculator1.minus(a, b);
        } else if (calculator2 != null) {
            return calculator2.minus(a, b);
        } else {
            return calculator3.minus(a, b);
        }
    }

    public double divide(double a, double b) {
        count++;
        if (calculator1 != null) {
            return calculator1.divide(a, b);
        } else if (calculator2 != null) {
            return calculator2.divide(a, b);
        } else {
            return calculator3.divide(a, b);
        }
    }

    public double multipy(double a, double b) {
        count++;
        if (calculator1 != null) {
            return calculator1.multipy(a, b);
        } else if (calculator2 != null) {
            return calculator2.multipy(a, b);
        } else {
            return calculator3.multipy(a, b);
        }
    }

    public double degree(double base, int exponent) {
        count++;
        if (calculator1 != null) {
            return calculator1.degree(base, exponent);
        } else if (calculator2 != null) {
            return calculator2.degree(base, exponent);
        } else {
            return calculator3.degree(base, exponent);
        }
    }

    public double module(double a) {
        count++;
        if (calculator1 != null) {
            return calculator1.module(a);
        } else if (calculator2 != null) {
            return calculator2.module(a);
        } else {
            return calculator3.module(a);
        }
    }

    public double radix(double a) {
        count++;
        if (calculator1 != null) {
            return calculator1.radix(a);
        } else if (calculator2 != null) {
            return calculator2.radix(a);
        } else {
            return calculator3.radix(a);
        }
    }

    public long getCountOperation() {
        return count;
    }
}