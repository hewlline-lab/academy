package home_work_1;

import java.util.Scanner;

public class ByteConverter {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // выбор конвертера
        System.out.println("Выберите 1 или 2");
        System.out.println("1 - Конвертер байты в килобайты");
        System.out.println("2 - Конвертер килобайтов в байты");
        int vibor = console.nextInt();

        // обработчик выбора и логика
        if (vibor == 1) {
            System.out.println("Конвертер байты в килобайты");
            System.out.println("Введите количество байтов");
            int num = console.nextInt();
            int result = num / 1024;
            System.out.println(num + " байтов в килобайтах равен " + result + " килобайтов");
        } else {
            System.out.println("Конвертер килобайтов в байты");
            System.out.println("Введите количество килобайтов");
            int num = console.nextInt();
            int result = num * 1024;
            System.out.println(num + " килобайтов в байтах равен " + result + " байтов");
        }
    }
}
