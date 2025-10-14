package home_work_1;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {

        int firstNum;
        int secondNum;

        int resultAnd;
        int resultOr;

        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число"); // вводим 3, в двоичном коде: 00000011
        firstNum = console.nextInt();

        System.out.println("Введите второе число"); // вводим 5, в двоичном коде 00000101
        secondNum = console.nextInt();

        // операция AND где 3 (00000011) и 5 (00000101)
        // при этой операции если оба бита будут равны одному, то 1, а если один бит, то 0. Если нет единиц 0=0
        // 00000011
        // 00000101
        //
        // 00000001 = 1

        resultAnd = firstNum & secondNum;
        System.out.println("При операции & (И | AND) ответ: " + resultAnd);

        // операция OR где 3 (00000011) и 5 (00000101)
        // а здесь, если в ряду есть хоть один бит, то в ответе на этом ряду должна быть единица
        // 00000011
        // 00000101
        //
        // 00000111 = 7

        resultOr = firstNum | secondNum;
        System.out.println("При операции | (ИЛИ | OR) ответ: " + resultOr);

    }
}