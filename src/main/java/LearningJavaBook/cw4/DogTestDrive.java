package LearningJavaBook.cw4;

public class DogTestDrive {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.size = 61;
        dog2.size = 15;
        dog3.size = 5;
        dog1.bark();
        dog2.bark();
        dog3.bark();
        dog1.smile(1);
    }
}
