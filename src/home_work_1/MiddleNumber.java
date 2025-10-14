package home_work_1;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // Ввод чисел
        System.out.println("Введите первое число");
        int num1 = console.nextInt(); // например 3
        System.out.println("Введите второе число");
        int num2 = console.nextInt(); // например 5
        System.out.println("Введите третье число");
        int num3 = console.nextInt(); // например 10

        // Счет (сначала ищем максимальное из всех чисел допустим сначала сравниваем 3 и 5
        // максимальное 5 потом оно сравнивается с num3 = 10 и теперь max 10)
        // по тому же принципу min, а потом из суммы этих чисел вычитаем максимальное и минимальное
        // и получаем среднее\
        
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        int result = num1 + num2 + num3 - min - max;

        // Вывод
        System.out.println("Среднее число из " + num1 + ", " + num2 + ", " + num3 + " = " + result);
    }
}