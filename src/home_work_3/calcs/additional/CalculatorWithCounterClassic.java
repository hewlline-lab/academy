package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long uses = 0;

    public void incrementCountOperation() {
        uses++;
    }

    public long getCountOperation() {
        return uses;
    }
}
