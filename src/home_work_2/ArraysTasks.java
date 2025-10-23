package home_work_2;

import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(50,100);
        int[] tmpContainer = container.clone();

        int a = 30;
        int b = 50;

        CheckDegree(container);
        MaxDegree(container);
        MiddleArefm(container);
        MinAndMax(container);
        TwoMin(container);
        Interval(tmpContainer, a, b);
        SumOfMas(container);
    }

    public static void CheckDegree(int[] container) {

        long result = 0;

        for (int i = 0; i < container.length; i++) {
            if (container[i] > 0 && container[i] % 2 == 0) {
                System.out.println("SUM | " + container[i] + " четное значит " + result + " + " + container[i] + " = " + (result + container[i]));
                result += container[i];
            }
        }
        System.out.println("SUM | Сумма четных, положительных чисел массива " + result);
        System.out.println();
    }

    public static void MaxDegree(int[] container) {

        long tmp = container[0];
        int index = 0;

        for (int i = 0; i < container.length; i += 2) {
            if (container[i] > tmp) {
                    tmp = container[i];
                    index = i;
            }
            else {
                System.out.println("MAX | Число " + container[i] + " меньше чем " + tmp);
            }
        }
        System.out.println("MAX | Максимальное число в массиве с четным индексом " + tmp + " с индексом " + index);
        System.out.println();
    }

    public static void MiddleArefm(int[] container) {

        long tmp = 0;
        long arefm = 0;

        for (int i = 0; i < container.length; i++) {
            tmp += container[i];
        }

        arefm = tmp / container.length;

        System.out.println("MIDDLE | Сумма всех цифр " + tmp + " и среднее арифмитическое " + arefm);

        System.out.print("MIDDLE | Элементы массива, которые меньше среднего арифметического ");
        for (int i = 0; i < container.length; i++) {
            if (arefm > container[i]) {
                System.out.print(container[i] + " ");
            }
        }
        System.out.println();
    }

    public static void MinAndMax(int[] container) {

        int min = 0;
        int max = 0;

        for (int i = 0; i < container.length; i++) {
            if (min > container[i]) {
                min = container[i];
            }
            if (max < container[i]) {
                max = container[i];
            }
        }

        System.out.println();
        System.out.println("MinAndMax | Минимальное " + min + " и Максимальное " + max);
    }
    public static void TwoMin(int[] container) {

        int min1 = 0;
        int min2 = 0;

        for (int i = 0; i < container.length; i++) {
            if (container[i] > min1) {
                min1 = container[i];
                min2 = container[i];
            }
        }

        for (int i = 0; i < container.length; i++) {
            if (container[i] < min1) {
                min2 = min1;
                min1 = container[i];
            } else if (container[i] < min2 && container[i] != min1) {
                min2 = container[i];
            }
        }

        System.out.println();
        System.out.println("TwoMin | 2 Минимальных числа " + min1 + " и " + min2);
        System.out.println();
    }

    public static void Interval(int[] container, int start, int end) {

        System.out.println("Interval | Массив " + Arrays.toString(container));

        System.out.println("Interval | Интервал " + start + " - " + end);

        System.out.print("Interval | Не входят в диапазон ");

        for (int i = 0; i < container.length; i++) {
            if (container[i] < start || end <= container[i] ) {
                System.out.print(container[i] + " ");
            } else {
                container[i] = 0;
            }
        }

        System.out.println();
        System.out.println("Interval | Сжатый массив " + Arrays.toString(container));
        System.out.println();
    }

    public static void SumOfMas(int[] container) {
        int totalDigitSum = 0;

        for (int i = 0; i < container.length; i++) {

            if (container[i] == 0) {
                System.out.println("SumMass | Число 0 сумма цифр: 0");
                continue;
            }

            int digitSum = 0;
            int temp = container[i];

            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            totalDigitSum += digitSum;
            System.out.println("SumMass | Число " + container[i] + " сумма цифр: " + digitSum);
        }

        System.out.println("SumMass | Общая сумма всех цифр массива: " + totalDigitSum);
    }

}
