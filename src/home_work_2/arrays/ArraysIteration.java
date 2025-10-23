package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole(); // получаем массив
        ArraysIteration.printAll(array);
        ArraysIteration.printSecond(array);
        ArraysIteration.printRevers(array);

    }

    public static void printAll(int[] arr) {
        System.out.println("=== Все элементы ===");

        // 1. do...while
        System.out.print("do...while: ");
        int i = 0;
        if (arr.length > 0) {
            do {
                System.out.print(arr[i] + " ");
                i++;
            } while (i < arr.length);
        }
        System.out.println();

        // 2. while
        System.out.print("while: ");
        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        // 3. for
        System.out.print("for: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. foreach
        System.out.print("foreach: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printSecond(int[] arr) {
        System.out.println("=== Каждый второй элемент ===");

        // 1. do...while (каждый второй = индексы 0, 2, 4...)
        System.out.print("do...while: ");
        int i = 0;
        if (arr.length > 0) {
            do {
                System.out.print(arr[i] + " ");
                i += 2;
            } while (i < arr.length);
        }
        System.out.println();

        // 2. while
        System.out.print("while: ");
        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 2;
        }
        System.out.println();

        // 3. for
        System.out.print("for: ");
        for (i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. foreach
        System.out.print("foreach: ");
        i = 0;
        for (int element : arr) {
            if (i % 2 == 0) {
                System.out.print(element + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void printRevers(int[] arr) {
        System.out.println("=== В обратном порядке ===");

        // 1. do...while
        System.out.print("do...while: ");
        int i = arr.length - 1;
        if (arr.length > 0) {
            do {
                System.out.print(arr[i] + " ");
                i--;
            } while (i >= 0);
        }
        System.out.println();

        // 2. while
        System.out.print("while: ");
        i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println();

        // 3. for
        System.out.print("for: ");
        for (i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] tmp = new int[arr.length];
        i = arr.length - 1;

        for (int element : arr) {
            tmp[i] = element;
            i--;
        }
        System.out.print("foreach: ");
        for (int element : tmp) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    }
