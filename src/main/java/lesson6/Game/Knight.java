package lesson6.Game;

public class Knight implements Hero{
    @Override
    public void attack(Enemy enemy) {
        System.out.println("Бью мечем");
        enemy.hurts(15);
    }
}
