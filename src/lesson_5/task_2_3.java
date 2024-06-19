package lesson_5;

import java.util.Scanner;

public class task_2_3 {
    public static void main(String[] args) {
 // Сделал не по заданию, хотел попробовать метод Scanner
        //int number = 3;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = Integer.parseInt(s);
        if (a % 2 == 0 && a % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        } else {
            if (a % 2 > 0 && a % 3 == 0) {
                System.out.println("Нечетное число. Кратно трем");
            } else {
                System.out.println(" Чисто не подходит по заданные условия");
            }
        }


    }
}
