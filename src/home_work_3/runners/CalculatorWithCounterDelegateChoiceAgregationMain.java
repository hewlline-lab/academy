package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        System.out.println("Пример CalculatorWithOperator");
        CalculatorWithOperator operatorCalc = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calc1 =
                new CalculatorWithCounterAutoChoiceAgregation(operatorCalc);

        double result1 = cacl(calc1);
        System.out.println("Результат: " + result1);
        System.out.println("Использований: " + calc1.getCountOperation());

        System.out.println("\nПример с CalculatorWithMathCopy");
        CalculatorWithMathCopy mathCopyCalc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calc2 =
                new CalculatorWithCounterAutoChoiceAgregation(mathCopyCalc);

        double result2 = cacl(calc2);
        System.out.println("Результат: " + result2);
        System.out.println("Использований: " + calc2.getCountOperation());

        System.out.println("\nПример CalculatorWithMathExtends");
        CalculatorWithMathExtends mathExtendsCalc = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calc3 =
                new CalculatorWithCounterAutoChoiceAgregation(mathExtendsCalc);

        double result3 = cacl(calc3);
        System.out.println("Результат: " + result3);
        System.out.println("Использований: " + calc3.getCountOperation());
    }

    private static double cacl(CalculatorWithCounterAutoChoiceAgregation calculator) {
        double one = calculator.multipy(15, 7);
        double two = calculator.degree(calculator.divide(28, 5), 2);
        double tree = calculator.sum(4.1, one);
        return calculator.sum(tree, two);
    }
}