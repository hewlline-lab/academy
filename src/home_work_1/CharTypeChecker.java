package home_work_1;

import java.util.Scanner;

public class CharTypeChecker {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // ввод символа
        char symbol = console.nextLine().charAt(0);

        // обработка выбранного символа и вывод
        if ((symbol >= 'А' && symbol <= 'Я') || (symbol >= 'а' && symbol <= 'я')
        || (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
        System.out.println(symbol + " - это буква");
        } else {
            System.out.println(symbol + " - это не буква");
        }
    }
}
