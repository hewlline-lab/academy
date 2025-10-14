package home_work_1;

import java.util.Scanner;

public class Delimost {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // ввод первого числа
        System.out.println("Введите первое число которое хотите делить");
        int num1 = console.nextInt();

        // ввод второго числа
        System.out.println("Введите второе число на которое хотите поделить");
        int num2 = console.nextInt();


        // проверка ввода, не ноль ли
        // если ноль, то останавливаем код
        if (num1 != 0 && num2 != 0) {
        } else {
            System.out.println("Нельзя делить на 0");
            return;
        }

        // основная часть кода (деление)
        if ((num1 % num2) == 0) {
            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        } else if (num2 % num1 == 0) {
            System.out.println("Числа которые вы ввели не деляться, но " +
                    "если поменять местами, то " + num2 + " / " + num1 + " = " + num2 / num1);
        } else {
            System.out.println("Числа никак нельзя поделить.");
        }
    }
}
