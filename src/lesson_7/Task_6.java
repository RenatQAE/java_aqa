package lesson_7;
import java.util.*;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Task_6 {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();
        points.put(new Player("noob",true,1),0);
        points.put(new Player("zxcBOTzxc",false,2),0);
        points.put(new Player("killer",true,3),0);
        points.put(new Player("mrBigDickGun",true,4),0);
        points.put(new Player("allCash",false,5),0);
        points.put(new Player("jvm",true,6),0);
        points.put(new Player("Py",true,7),0);
        points.put(new Player("girl",false,8),0);
        points.put(new Player("qwerty",true,9),0);
        points.put(new Player("admin",true,10),0);

        points.replace(new Player("mrBigDickGun",true,4), 0,10);
        points.replace(new Player("Py",true,7),0,12);
        points.replace(new Player("girl",false,8), 0,11);
        points.replace(new Player("qwerty",true,9), 0,13);
        points.replace(new Player("admin",true,10), 0,13);

        List<Map.Entry<Player, Integer>> sortedPlayers = new ArrayList<>(points.entrySet());
        sortedPlayers.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Выводим 3 лучших игроков
        System.out.println("Три лучших игрока турнира:");
        for (int i = 0; i < 3; i++) {
            Map.Entry<Player, Integer> entry = sortedPlayers.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " - " + entry.getValue() + " очков");


        }

    }
}
//делал по примерам но что то не сработало как надо по поинтам сорт