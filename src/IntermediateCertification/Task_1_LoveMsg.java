package IntermediateCertification;

import java.util.Scanner;

public class Task_1_LoveMsg {
    public static void main(String[] args) {


        int letters = 15; // количество букв в признании в любви
        int space = 3; // количество пробелов в признании
        int lettersLength = (letters / 3) * 62; //  каждые 3 буквы= 62см длины забора
        int spaceLength = (space * 12); // длина 1 пробела
        int fenceLength = new Scanner(System.in).nextInt(); // ввод длинны забора в см

        {
            if (lettersLength + spaceLength <= fenceLength) {
                System.out.println("При длине забора в " + fenceLength + "см" + " - Надпись уместиться!");
            } else {
                System.out.println("При длине забора в " + fenceLength + "см" + " - Надпись НЕ уместиться!");
            }
        }
    }
}


