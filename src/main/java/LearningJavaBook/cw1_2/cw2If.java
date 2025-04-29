package LearningJavaBook.cw1_2;

import java.util.Scanner;

public class cw2If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        if (x == 3){
            System.out.println("x = 3");

        }else {
            System.out.println("х не равен 3");
        }
        System.out.println("Эта строка выполняется в любом случае");

    }
}
