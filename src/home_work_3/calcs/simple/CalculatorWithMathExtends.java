package home_work_3.calcs.simple;

public class CalculatorWithMathCopyMain {

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
        if (base > 0 && exponent >= 0) {
            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
            return result;
        } else {
            System.out.println("Ошибка: основание должно быть положительным, степень - неотрицательной");
            return 0;
        }
    }

    public double module(double a) {
        double result;
        if (a < 0) {
            result = a * -1;
        } else {
            result = a;
        }
        return a;
    }

    public double radix(double a) {
        return Math.sqrt(a);
    }

}