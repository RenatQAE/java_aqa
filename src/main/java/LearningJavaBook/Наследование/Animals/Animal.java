package LearningJavaBook.Наследование.Animals;

public class Animal {
    public String picture;
    public String food;
    public int hunger;
    public String boundaries;
    public String location;

    void makeNoise(){
        System.out.println("Ауф");
    }
    void eat(){
        System.out.println("я ем");
    }
    void sleep(){
        System.out.println("Я сплю");
    }
    void roam(){
        System.out.println("я тусуюсь");
    }
}
