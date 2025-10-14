package home_work_1;

public class MathTests {
    public static void main(String[] args) {

        // Возвращает минимальное число из двух
        System.out.println("Math MIN значения\n");
        System.out.println(Math.min(9, 59));        // 9
        System.out.println(Math.min(100, 3919));    // 100
        System.out.println(Math.min(190.123, 191)); // 190.123

        // Возвращает максимальное число из двух
        System.out.println("\nMath MAX значения\n");
        System.out.println(Math.max(9, 100));           // 100
        System.out.println(Math.max(30, 1912));         // 1912
        System.out.println(Math.max(1923, 3912.23213)); // 3912.23213

        // Возвращает абсолютное значение числа (модуль)
        System.out.println("\nMath ABS значения\n");
        System.out.println(Math.abs(-10.213)); // 10.213
        System.out.println(Math.abs(0));       // 0
        System.out.println(Math.abs(-5.234));  // 5.234

        // Округление
        System.out.println("\nMath CEIL значения (округление вверх)\n");
        System.out.println(Math.ceil(10.32));  // 11.0
        System.out.println(Math.ceil(132.54)); // 133.0
        System.out.println(Math.ceil(-10.78)); // -10.0

        System.out.println("\nMath FLOOR значения (округление вниз)\n");
        System.out.println(Math.floor(10.32));  // 10.0
        System.out.println(Math.floor(132.54)); // 132.0
        System.out.println(Math.floor(-10.78)); // -11.0

        System.out.println("\nMath ROUND значения (математическое округление)\n");
        System.out.println(Math.round(10.32));  // 10
        System.out.println(Math.round(10.78));  // 11
        System.out.println(Math.round(-10.32)); // -10
        System.out.println(Math.round(-10.78)); // -11

        // Возведение в степень
        System.out.println("\nMath POW значения (A в степени B)\n");
        System.out.println(Math.pow(1.32, 2)); // 1.7424
        System.out.println(Math.pow(-8, 3));   // -512.0
        System.out.println(Math.pow(5, 3));    // 125.0

        // Квадратный корень
        System.out.println("\nMath SQRT значения (квадратный корень)\n");
        System.out.println(Math.sqrt(16));     // 4.0
        System.out.println(Math.sqrt(5));      // 2.23606797749979
        // System.out.println(Math.sqrt(-8)); // ошибка, NaN

        // Кубический корень
        System.out.println("\nMath CBRT значения (кубический корень)\n");
        System.out.println(Math.cbrt(27));     // 3.0
        System.out.println(Math.cbrt(-8));     // -2.0
        System.out.println(Math.cbrt(5));      // 1.709975946676697

        System.out.println("\nMath RANDOM случайное значение\n");

        // Случайные числа
        System.out.println("Случайное число: " + Math.random());
        System.out.println("Случайное число до 100: " + (int)(Math.random() * 100));

        System.out.println("\nMath SIN/COS тригонометрия\n");
        // Тригонометрия
        System.out.println("sin 30: " + Math.sin(Math.toRadians(30))); // ~0.5
        System.out.println("cos 60: " + Math.cos(Math.toRadians(60))); // ~0.5

        System.out.println("\nMath LOG/LOG10 логорифмы\n");
        // Логарифмы
        System.out.println("log e: " + Math.log(Math.E));     // 1.0
        System.out.println("log10 100: " + Math.log10(100)); // 2.0

        System.out.println("\nMath константы\n");
        // Константы
        System.out.println("Число PI: " + Math.PI);
        System.out.println("Число E: " + Math.E);
    }
}