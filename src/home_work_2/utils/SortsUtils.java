package home_work_2.utils;

import java.util.Arrays;

public class SortsUtils {
    public static void sort(int[] arr) {

        boolean ready = false;
        int temp;
        int x = arr.length;

        while (!ready) {
            ready = true;
            for (int i = 0; i < x - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    ready = false;
                }
            }
            x--;
        }

        System.out.println("Пузырьковая: " + Arrays.toString(arr));

    }

    public static void shake(int[] arr) {

        boolean ready = false;
        int left = 0;
        int right = arr.length - 1;
        int temp;

        while ((left < right) && !ready) {
            ready=true;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    ready = false;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    ready = false;
                }
            }
            left++;
            if(ready == true) {
                break;
            }
        }
        System.out.println("Шейкерная: " + Arrays.toString(arr));
    }
}
