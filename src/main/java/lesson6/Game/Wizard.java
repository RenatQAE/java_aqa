package lesson6.Game;

public class Wizard implements Hero {
    @Override
    public void attack(Enemy enemy) {
        System.out.println("Колдуем!");
        enemy.hurts(10);
    }
}
