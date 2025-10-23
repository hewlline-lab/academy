package home_work_2;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Первый блок 2-5
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                String line = j + " x " + i + " = " + (j * i);

                if (j * i < 10) {
                    System.out.print(line + "   | ");
                } else {
                    System.out.print(line + "  | ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Второй блок 6-9
        for (int i = 2; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                String line = j + " x " + i + " = " + (j * i);

                if (j * i < 10) {
                    System.out.print(line + "   | ");
                } else {
                    System.out.print(line + "  | ");
                }
            }
            System.out.println();
        }
    }
}