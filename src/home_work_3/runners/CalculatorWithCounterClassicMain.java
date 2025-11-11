package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassic {
    public static void main(String[] args) {

        CalculatorWithCounterClassic operators = new CalculatorWithCounterClassic();

        double one = operators.multipy(15, 7);
        double two = operators.degree(operators.divide(28, 5), 2);
        double tree = operators.sum(4.1, one);
        double four = operators.sum(tree, two);

        System.out.println(four);

    }
}
