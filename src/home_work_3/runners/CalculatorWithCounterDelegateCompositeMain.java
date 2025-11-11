package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite operators = new CalculatorWithCounterAutoComposite();

        double one = operators.multipy(15, 7);
        double two = operators.degree(operators.divide(28, 5), 2);
        double tree = operators.sum(4.1, one);
        double four = operators.sum(tree, two);

        System.out.println(four);
        System.out.println("Использований: " + operators.getCountOperation());

    }
}
