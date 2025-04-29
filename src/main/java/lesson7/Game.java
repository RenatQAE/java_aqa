package lesson7;

import lesson6.Game.*;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {


        List<Hero> squad = new ArrayList<>();
        squad.add(new Knight());
        squad.add(new Wizard());

        Enemy t = new Troll();

        for (Hero hero : squad){
            hero.attack(t );
        }
    }
}
