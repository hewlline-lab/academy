package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy mathCalc = new CalculatorWithMathCopy();

        CalculatorWithCounterAutoAgregation calculator =
                new CalculatorWithCounterAutoAgregation(mathCalc);

        double one = calculator.multipy(15, 7);
        double two = calculator.degree(calculator.divide(28, 5), 2);
        double tree = calculator.sum(4.1, one);
        double four = calculator.sum(tree, two);

        System.out.println("Результат: " + four);
        System.out.println("Использований: " + calculator.getCountOperation());
    }
}
