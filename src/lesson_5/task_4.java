package lesson_5;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        String password = new Scanner(System.in).nextLine();
        if (password.length() >= 8) {
            if (password.matches("(?=.*[a-z])(?=.*[0-9]).{8,}")) {
                if (password.matches("(?=.*[a-z])(?=.*[!@#$%^&*№]).{8,}")) {
                    System.out.println("Пароль принят");
                } else {
                    System.out.println("Пароль должен содержать минимум один символ");
                }
            } else {
                System.out.println("Пароль должен содержать минимум одну цифру");
            }
        } else {
            System.out.println("Пароль должен быть не менее 8 символов");

        }

    }
}

