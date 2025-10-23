package home_work_2.loops;

import java.util.Scanner;

public class MultiplicationsAllDigits {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Ведите целое число");
        String input = console.next();

        // проверяем есть ли точка / запятая в числе
        if (input.contains(".") || input.contains(",")) {
            System.out.println("Введено не целое число");

        } else if (input.matches("-?\\d+")) {

            int num = Integer.parseInt(input);

            digits(num);

        } else {
            System.out.println("Введено не число");
        }
    }

    public static void digits(int num) {
        // убираем минус если есть и вводим переменные
        int absNumber = Math.abs(num);
        int temp = absNumber;
        int digitcount = 0;

        // считаем кол-во цифр
        while (temp > 0) {
            digitcount++;
            temp /= 10;
        }

        // создаем контейнер
        int[] digit = new int[digitcount];
        temp = absNumber;

        // сортируем чтоб все цифры были попорядку
        for (int i = digitcount - 1; i >= 0; i--) {
            digit[i] = temp % 10;
            temp /= 10;
        }

        long result = 1;

        System.out.print(digit[0]);
        result *= digit[0];

        // выводим все попорядку в консоль
        for (int i = 1; i < digit.length; i++) {
            System.out.print(" * " + digit[i]);
            result *= digit[i];
        }

        System.out.println(" = " + result);
    }

    }
