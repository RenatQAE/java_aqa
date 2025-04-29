package lesson6;

public class PlayGroundLesson6 {
    public static void main(String[] args) {

        User user1 = new User("ALex","mail@mail.ru");
        user1.notifyEmail("Вас хотят добавить в друзья");

        BankCard bankCard = new BankCard("1234 5678 9012 3456", "8987");
        bankCard.getNumber("8987");
    }
}
