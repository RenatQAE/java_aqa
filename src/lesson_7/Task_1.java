package lesson_7;

public class Task_1 {
    public static void main(String[] args) {

        Player player1 = new Player("Aragorn",true,1);
        Player player2 = new Player("Aragorn",true,1);

        System.out.println(player1 == player2);
        System.out.println(player1.equals(player2));
    }
}
