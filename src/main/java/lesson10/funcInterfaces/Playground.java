package lesson10.funcInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class Playground {
    public static void main(String[] args) {

        List<String> names = List.of(
                "Галина",
                "Danila",
                "Никита",
                "Анна",
                "Милана"
                );

        Consumer<String> consumer = new Consumer<String>() {
            public void accept(String s){
                System.out.println("<====");
                System.out.println(s);
                System.out.println("====>");
            }};
            Consumer<String> consumer2 = new Consumer<String>() {
                public void accept(String s){
                    System.out.print("[");
                    System.out.print(s);
                    System.out.println("]");
                }

        };
        Consumer<String> consumer3 = new Consumer<String>() {
            public void accept(String s){
                System.out.println("хахахах");
                System.out.println(s);
                System.out.println("ахахахах");
            }

        };
        for (String name : names){
            printName(name,consumer);
        }

    }
    public static void printName(String name,Consumer<String> action){
        action.accept(name);
    }
}
