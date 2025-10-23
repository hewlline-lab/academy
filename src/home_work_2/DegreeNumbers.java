package home_work_2;

import java.util.Scanner;

public class DegreeNumbers {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите число для возведения в степень (через запятую, если не целое)");
        double num = console.nextDouble();

        System.out.println("Введите степень");
        int degree = console.nextInt();

        if (degree < 0) {
            System.out.println("Степень должна быть положительная");
            return;
        }

        double result = 1;

        for (int i = 0; i < degree; i++) {
            result = result * num;
        }

        System.out.println(num + " ^ " + degree + " = " + result);

    }
}
