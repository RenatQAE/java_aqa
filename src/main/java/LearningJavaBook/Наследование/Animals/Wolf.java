package LearningJavaBook.Наследование.Animals;

import java.util.Scanner;

public class Wolf extends Animal {
    public static void main(String[] args) {
    Wolf wolf = new Wolf();
    wolf.eat();
        Scanner scanner = new Scanner(System.in);
        wolf.food = scanner.next();
    if (wolf.food.equals("мясо")){
        System.out.println("я ем мясо");
    }else
        System.out.println("я вегетарианец");

  wolf.makeNoise();
}}
