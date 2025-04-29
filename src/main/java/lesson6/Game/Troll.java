package lesson6.Game;

public class Troll implements Enemy{
    private int hp = 50;
    private boolean isAlive = true;

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void hurts(int hp) {

        if (this.hp > 0){
            System.out.println("Ой больно");
            this.hp = this.hp- hp;
        }
        if (this.hp <= 0){
            this.isAlive = false;
            System.out.println("I`m dead");
        }

    }
}
