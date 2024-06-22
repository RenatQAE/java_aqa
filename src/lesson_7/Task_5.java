package lesson_7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task_5 {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        players.add(new Player("noob",true,1));
        players.add(new Player("zxcBOTzxc",false,2));
        players.add(new Player("killer",true,3));
        players.add(new Player("mrBigDickGun",true,4));
        players.add(new Player("allCash",false,5));
        players.add(new Player("jvm",true,6));
        players.add(new Player("Py",true,7));
        players.add(new Player("girl",false,8));
        players.add(new Player("qwerty",true,9));
        players.add(new Player("admin",true,10));

// Дубликат: Ок
        players.add(new Player("noob",true,1));

        for (Player player : players){

            System.out.println(player);
        }
    }
}
// хотел сделать отсортированный список, делал через TreeSet но не разобрался в синтаксисе..