package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        System.out.println("С CalculatorWithOperator");
        CalculatorWithOperator operatorCalc = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface calc1 =
                new CalculatorWithCounterAutoAgregationInterface(operatorCalc);

        double result1 = calc(calc1);
        System.out.println("Результат: " + result1);
        System.out.println("Использований: " + calc1.getCountOperation());

        System.out.println("\nС CalculatorWithMathCopy");
        CalculatorWithMathCopy mathCopyCalc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calc2 =
                new CalculatorWithCounterAutoAgregationInterface(mathCopyCalc);

        double result2 = calc(calc2);
        System.out.println("Результат: " + result2);
        System.out.println("Использований: " + calc2.getCountOperation());

        System.out.println("\nС CalculatorWithMathExtends");
        CalculatorWithMathExtends mathExtendsCalc = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregationInterface calc3 =
                new CalculatorWithCounterAutoAgregationInterface(mathExtendsCalc);

        double result3 = calc(calc3);
        System.out.println("Результат: " + result3);
        System.out.println("Использований: " + calc3.getCountOperation());
    }

    private static double calc(CalculatorWithCounterAutoAgregationInterface calculator) {
        double one = calculator.multipy(15, 7);
        double two = calculator.degree(calculator.divide(28, 5), 2);
        double tree = calculator.sum(4.1, one);
        return calculator.sum(tree, two);
    }
}