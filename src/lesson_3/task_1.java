package lesson_3;

public class task_1 {
    public static void main(String[] args) {
        String cardNumber = "1234 5678 9012 3456";
        String cardNumber2 = "1234567890123456";
        System.out.println("**** **** **** "+cardNumber.substring(cardNumber.length() -4));
        System.out.println("**** **** **** "+cardNumber2.substring(cardNumber2.length() -4));

    }
}
