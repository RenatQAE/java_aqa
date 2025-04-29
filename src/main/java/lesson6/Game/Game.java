package lesson6.Game;

public class Game {
    public static void main(String[] args) {

        Hero hero = new Knight();
        Hero wizard = new Wizard();
        Enemy enemy = new Troll();
        hero.attack(enemy);
        hero.attack(enemy);
        wizard.attack(enemy);
        wizard.attack(enemy);

        System.out.println(enemy.isAlive());

    }
}
