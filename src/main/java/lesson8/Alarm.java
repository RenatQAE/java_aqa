package lesson8;

import java.time.LocalTime;
import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Во сколько вас разбудить? ");
        String input = new Scanner(System.in).nextLine();
        String s = null;


        try {
            LocalTime alarm = LocalTime.parse(input);
            System.out.println(alarm);
            for (int i = 0; i < 10000 ; i++) {
            Thread.sleep(1000L);

            LocalTime now = LocalTime.now();
                System.out.println(s.length());
            if (now.isAfter(alarm)){
                System.out.println("Будим!!!");
                System.err.print(i);
                break;
            }

        }
        System.out.println(input);
        } catch (NullPointerException ex){
            System.out.println(ex);
        } catch (Exception ex){
            System.out.println(ex.getMessage());

        }
        System.out.println("Finish");

    }
}
