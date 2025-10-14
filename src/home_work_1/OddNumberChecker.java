package home_work_1;

import java.util.Scanner;

public class OddNumberChecker {
    public static void main(String[] args) {

        System.out.println("Введите целое четное или нечетное число");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();

        if (num % 2 == 0) {
            System.out.println("Число " + num + " четное");
        } else {
            System.out.println("Число " + num + " нечетное");
        }
    }
}
