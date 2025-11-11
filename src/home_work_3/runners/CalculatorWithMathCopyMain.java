package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithOperator operators = new CalculatorWithOperator();

        double one = operators.multipy(15, 7);
        double two = operators.degree(operators.divide(28, 5), 2);
        double tree = operators.sum(4.1, one);
        double four = operators.sum(tree, two);

        System.out.println(four);

    }
}
