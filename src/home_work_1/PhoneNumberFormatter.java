package home_work_1;

public class PhoneNumberFormatter {
    public static void main(String[] args) {

        // осознал ошибку, успел исправить)

        String result = createPhoneNumber();

        System.out.println("Ваш номер телефона " + result);
    }

//        int[] arroy = createPhoneNumber();
//
//        System.out.println("\nВаш номер телефона");
//        System.out.println("(" + arroy[0] + arroy[1] + arroy[2] + ") "
//                + arroy[3] + arroy[4] + arroy[5] + "-"
//                + arroy[6] + arroy[7] + arroy[8] + arroy[9]);}

    public static String createPhoneNumber() {

        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,0};

        return "(" + numbers[0] + numbers[1] + numbers[2] + ")" + " " +
                numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] +
                numbers[8] + numbers[9];

//        int[] numbers = new int[10];
//
//        // for для заполнения массива цифрами
//        for (int i = 0; i < 10; i++) {
//            int num = (int)(Math.random() * 10);
//            numbers[i] = num;
//        }
//
//        return numbers;

    }
}
