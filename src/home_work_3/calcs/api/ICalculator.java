package home_work_3.calcs.api;

public interface ICalculator {

    double sum(double a, double b);
    double minus(double a, double b);
    double divide(double a, double b);
    double multipy(double a, double b);

    double degree(double base, int exponent);
    double module(double number);
    double radix(double number);
}