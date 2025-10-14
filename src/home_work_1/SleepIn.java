package home_work_1;

import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // ввод впороса о дне недели
        System.out.println("Сейчас будний день? true/false");
        boolean day = console.nextBoolean();

        // ввод вопроса про отпуск
        System.out.println("Вы сейчас в отпуске? true/false");
        boolean vacation = console.nextBoolean();

        // отправка запроса в метод sleepIn
        boolean GoodMind = sleepIn(day, vacation);

        // обработка после ответа метода sleepIn
        if (GoodMind) {
            System.out.println("Отлично, тогда спим дальше");
        } else {
            System.out.println("Кажется, пора вставать");
        }
    }

    // Статический метод sleepIn
    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
