package lesson7;

import lesson6.Game.Hero;
import lesson6.Game.Knight;
import lesson6.Game.Wizard;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Hero> players = new HashMap<>();

        players.put("Hunter777",new Wizard());
        players.put("Noob",new Knight());
        players.put("Pro",new Knight());

        Hero knight = players.get("Noob");

    }
}
