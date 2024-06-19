package lesson_5;

import java.util.Scanner;

public class Card {
    private String number;
    private String beforeDate;
    private int cvv;
    private String pin;

    public Card(String number, String beforeDate, int cvv, String pin) {
        this.number = number;
        this.beforeDate = beforeDate;
        this.cvv = cvv;
        this.pin = pin;
    }

    public void numbers() {
        String n = this.number;
        System.out.println("**** **** **** " + n.substring(n.length() - 4));

    }

    public void setPinCode(){


        Scanner card = new Scanner(System.in);
        String cardNumber = card.nextLine();
        if (cardNumber.equals(this.pin)) {
            System.out.println(this.number);
        } else {
            System.out.println();

        }
    }

    public String getNumber() {
        return this.number;
    }

    public String getBeforeDate() {
        return this.beforeDate;
    }

    public int getCvv() {
        return this.cvv;
    }

    public String getPin() {
        return this.pin;
    }
}


