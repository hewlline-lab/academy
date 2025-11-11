package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic operators = new CalculatorWithCounterClassic();

        double one = operators.multipy(15, 7);

        operators.incrementCountOperation();

        double two = operators.degree(operators.divide(28, 5), 2);

        operators.incrementCountOperation();
        operators.incrementCountOperation();

        double tree = operators.sum(4.1, one);

        operators.incrementCountOperation();

        double four = operators.sum(tree, two);

        operators.incrementCountOperation();

        System.out.println(four);
        System.out.println("Использований: " + operators.getCountOperation());

    }
}
