package home_work_2;

import java.util.Scanner;

public class Multiplications {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите число для перемножения");
        long num = console.nextLong();

        long result = 1;

        if (num > 0) {

            for (int i = 2; i <= num ; i++) {
                if (result > Long.MAX_VALUE / i) {
                    System.out.println("Переполение для" + num);
                    break;
                } else {
                        result = result * i;
                        System.out.println(result + " * " + i);
                }
            }
        } else if (num == 0) {
            System.out.println("0 нельзя");
        } else {
            System.out.println("Число должно быть неотрицательным");
        }

    }
}
