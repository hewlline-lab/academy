package home_work_1;

import java.util.Scanner;

public class BinaryStringConverter {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите преобразуемое число");
        int number = console.nextByte();

        String result = toBinaryString(number);

        System.out.println(number + " число в двоичной системе " + result);

    }

    public static String toBinaryString(int number) {

        int[] bytes = new int[8];
        String result = "";

        if (number >= 0) {
            
            int temp = number;

            // для положительных просто делаем обычный перевод
            for(int i = 7; i >= 0; i--) {

                bytes[i] = temp % 2;
                temp = temp / 2;

            }

            // собираем
            for(int bit : bytes) {

                result += bit;

            }
            return result;

        } else {

            // преобразую модуль
            int positive = Math.abs(number);

            // превращаем в прямой код
            for(int i = 7; i >= 0; i--) {

                bytes[i] = positive % 2;
                positive = positive / 2;

            }

            // прямой код
            for(int i = 0; i < 8; i++) {

                bytes[i] = bytes[i] == 0 ? 1 : 0;
            }

            // обратный код
            int temp = 1;
            for(int i = 0; i < 8; i++) {

                int sum = bytes[i] + temp;
                bytes[i] = sum % 2;
                temp = sum / 2;

                if (temp == 0) {
                    break;
                }
            }
        }

        // собраю результат
        for(int bit : bytes) {

            result += bit;

        }
        return result;
    }
}