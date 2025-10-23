package home_work_2;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole() {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int count = console.nextInt();

        int[] container = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Введите число для ячейки с индексом " + i);
            container[i] = console.nextInt();
        }

        return container;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int[] container = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int num = random.nextInt(maxValueExclusion);
            container[i] = num;
        }

        return container;
    }

}
