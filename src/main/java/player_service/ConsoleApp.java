package player_service;

import java.util.Map;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {

        PlayerService playerService = null;
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        if (command.equalsIgnoreCase("leaderboard")){
            Map<String, Integer> leaderBoard = playerService.getLeaderBoard();
            /// как вывести в консоль

        }



    }
}
