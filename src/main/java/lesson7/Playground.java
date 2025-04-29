package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Playground {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Renat");
        strings.add("Marat");
        strings.add("Alina");
        strings.add("Kirill");
        strings.add("Azamat");
        System.out.println(strings.size());

        strings.remove("Kirill");
        System.out.println(strings.size());

        strings.add(1,"Mikhail");
        System.out.println(strings.size());



        for (String string : strings){
            System.out.println(string.toUpperCase());
        }
    strings.get(3);
    }
}
