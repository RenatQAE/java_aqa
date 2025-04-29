package LearningJavaBook.cw1_2;

public class Dog {
    private  String name;
    private int size;

    public Dog(int size, String name) {
        this.size = size;
        this.name = name;
    }
    public void bark(String message){
        System.out.println(message);
    }
    public void play(String message){
        System.out.println(message);
    }

    public String getName() {
        return name;
    }
}
