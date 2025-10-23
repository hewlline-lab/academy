package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {
    public static void main(String[] args) {
        testSort(new int[]{1,2,3,4,5,6});
        testSort(new int[]{1,1,1,1});
        testSort(new int[]{9,1,5,99,9,9});
        testSort(new int[]{});
        testSort(new int[]{6,5,4,3,2,1});

        testSort(ArraysUtils.arrayRandom(50,100));

        testSort(ArraysUtils.arrayFromConsole());
    }

    public static void testSort(int[] arr) {

        System.out.println();
        SortsUtils.sort(arr);
        System.out.println();
        SortsUtils.shake(arr);

    }
}
