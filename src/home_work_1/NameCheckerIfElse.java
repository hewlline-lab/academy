package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class NameCheckerIfElse {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // Ввод имени
        System.out.println("Введите ваше имя");
        String name = console.nextLine();

        // проверяет написание переменной name и выдает ответ
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else {
            if (Objects.equals(name, "Анастасия")) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
