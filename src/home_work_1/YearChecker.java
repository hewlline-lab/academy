package home_work_1;

import java.util.Scanner;

public class YearChecker {
    public static void main(String[] args) {

        Scanner cosnole = new Scanner(System.in);

        // ввод года
        System.out.println("Введите год для проверки");
        int year = cosnole.nextInt();

        // обработка выбранного года
        // точнее, если он делится на 4 бещ остатка
        // НЕ делится на 100 без остатка или делится на 400 без остатка
        if ((year % 4 == 0) && (year % 100 != 0 || (year % 400 == 0))) {
            System.out.println(year + " високосный год");
        }
        else {
            System.out.println(year + " не високосный год");
        }
    }
}
