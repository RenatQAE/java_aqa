package lesson6;

public class BankCard {

    private String number;
    private String pinCode;

    public BankCard(String number, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }
    public void getNumber(){
        System.out.println("**** **** ****   "+number.substring(number.length()-4)); // shablon 1234 5678 9012 3456;

    }
    public void getNumber(String pinCode){
        if (pinCode.equals(this.pinCode)){
            System.out.println(this.number);
        }else {
            getNumber();
        }
    }
}
