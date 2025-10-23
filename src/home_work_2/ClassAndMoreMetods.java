package home_work_2;

import java.util.Random;
import java.util.Scanner;

public class ClassAndMoreMetods {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int choise = console.nextInt();

        switch (choise) {
            case 1:

                System.out.println("Введите целое число");
                int num = console.nextInt();

                if (num == 0) {
                    System.out.println("Число не может быть равно 0");
                    return;
                }

                System.out.println(soBestOfNum(num));
                break;
            case 2:

                System.out.println("Введите целое число кол-ва генерации рандомных чисел");
                int count = console.nextInt();

                if (count == 0) {
                    System.out.println("Число не может быть равно 0");
                    return;
                }

                System.out.println(soRandomNumbers(count));
                break;
            case 3:

                System.out.println("Введите целое число для подсчета");
                int num1 = console.nextInt();

                if (num1 == 0) {
                    System.out.println("Число не может быть равно 0");
                    return;
                }

                System.out.println(soProbabilNumbers(num1));
                break;
            case 4:

                System.out.println("Введите кол-во для вывода");
                int num2 = console.nextInt();

                if (num2 == 0) {
                    System.out.println("Число не может быть равно 0");
                    return;
                }

                soFibonachi(num2);
                break;
            case 5:

                System.out.println("Введите начала диапозона");
                int start = console.nextInt();
                System.out.println("Введите конец диапозона");
                int end = console.nextInt();
                System.out.println("Введите шаг");
                int step = console.nextInt();

                if (step == 0) {
                    System.out.println("Шаг не может быть равен 0");
                    return;
                }

                if (step < 0 && start < end) {
                    System.out.println("При отрицательном шаге начало должно быть больше конца");
                    return;
                }

                soStep(start, end, step);
                break;
            case 6:

                System.out.println("Введите число");
                int num3 = console.nextInt();

                System.out.println(soRevers(num3));
                break;
        }

    }

    public static int soBestOfNum(int num) {

        int temp = Math.abs(num);
        int numcount = 0;

        int maxDigit = 0;

        while (temp > 0) {
            numcount++;
            temp /= 10;
        }

        temp = Math.abs(num);

        for (int i = 0; i < numcount; i++) {
            int number = temp % 10;
            temp /= 10;
            if (number > maxDigit) {
                maxDigit = number;
            }
        }
        return maxDigit;
    }

    public static String soRandomNumbers(int count) {

        int succesCount = 0;
        Random random = new Random();

        for (int i = 0; i < count; i++) {

            int randomNumbers = random.nextInt(1000);
            if (randomNumbers % 2 == 0) {
                succesCount++;
            }
        }

        double probabil = (double) succesCount / count * 100;

        return "Четных: " + succesCount + " | Не четных: " + (count - succesCount) + " | Вероятность четных: " + probabil+"%";
    }

    public static String soProbabilNumbers(int num) {

        int count = 0;

        int evennumbers = 0;

        int temp = Math.abs(num);

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = Math.abs(num);

        for (int i = 0; i < count; i++) {
            int result = num % 10;
            num = num / 10;
            if (result % 2 == 0) {
                evennumbers++;
            }
        }

        return "Четных: " + evennumbers + " | Не четных: " + (count - evennumbers);
    }

    public static void soFibonachi(int num) {

        int count = Math.abs(num);

        long first = 0;
        long second = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(first);
            if (i < num - 1) {
                System.out.print(" | ");
            }

            long next = first + second;
            first = second;
            second = next;
        }
    }

    public static void soStep(int start, int stop, int step) {

        System.out.println("Числа");

        if (step > 0) {
            for (int i = start; i <= stop; i += step) {
                System.out.print(i);
                if (i + step <= stop) {
                    System.out.print(", ");
                }
            }
        } else {
            for (int i = start; i >= stop; i += step) {
                System.out.print(i);
                if (i + step >= stop) {
                    System.out.print(", ");
                }
            }
        }
    }
    public static String soRevers(int num) {

        int temp = Math.abs(num);
        int reversed = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        return "Изначально: " + num + " | Перевернутое: " + (num < 0 ? -reversed : reversed);
    }
}
