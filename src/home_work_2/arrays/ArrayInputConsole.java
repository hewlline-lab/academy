package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputConsole {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int count = console.nextInt();

        int[] container = arrayFromConsole(count);

        System.out.println(Arrays.toString(container));

    }
    public static int[] arrayFromConsole(int count) {

        Scanner console = new Scanner(System.in);

        int[] container = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Введите число для ячейки " + i);
            container[i] = console.nextInt();
        }

        return container;

    }
}
