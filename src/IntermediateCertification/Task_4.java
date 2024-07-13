package IntermediateCertification;


import java.util.Scanner;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        for (int i = 0; i < 5; i++) {
            String userChoice = getUserChoice(scanner);
            String computerChoice = getComputerChoice(random);
            int roundResult = playRound(userChoice, computerChoice);

            if (roundResult == 1) {
                userScore++;
            } else if (roundResult == 2) {
                computerScore++;
            }
        }

        System.out.println("Игра окончена!");
        System.out.println("Счет: Пользователь " + userScore + " - " + computerScore + " Компьютер");

        if (userScore > computerScore) {
            System.out.println("Вы победили!");
        } else if (userScore < computerScore) {
            System.out.println("Компьютер победил!");
        } else {
            System.out.println("Ничья!");
        }

        scanner.close();
    }

    public static String getUserChoice(Scanner scanner) {
        System.out.print("Введите К (камень), Н (ножницы) или Б (бумагу): ");
        String userChoice = scanner.nextLine().toUpperCase();

        while (!userChoice.equals("К") && !userChoice.equals("Н") && !userChoice.equals("Б")) {
            System.out.print("Введите К (камень), Н (ножницы) или Б (бумагу): ");
            userChoice = scanner.nextLine().toUpperCase();
        }

        return userChoice;
    }

    public static String getComputerChoice(Random random) {
        String[] choices = {"К", "Н", "Б"};
        int randomIndex = random.nextInt(choices.length);
        return choices[randomIndex];
    }

    public static int playRound(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return 0;
        } else if ((userChoice.equals("К") && computerChoice.equals("Н")) ||
                (userChoice.equals("Н") && computerChoice.equals("Б")) ||
                (userChoice.equals("Б") && computerChoice.equals("К"))) {
            return 1;
        } else {
            return 2;
        }
    }
}