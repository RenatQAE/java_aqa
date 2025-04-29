package LearningJavaBook.gettersSetters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog dog1 = new GoodDog();
        dog1.setSize(10);
        dog1.bark();
        GoodDog[] goodDogs = new GoodDog[2];
        goodDogs[0] = new GoodDog();
        goodDogs[1] = new GoodDog();
        goodDogs[0].setSize(15);
        goodDogs[1].setSize(66);
        goodDogs[0].bark();
        goodDogs[1].bark();
        System.out.println(goodDogs[0].equals(goodDogs[1])) ;

        int[] cells = new int[4];
        cells[0] = 1;
        cells[1] = 2;
        cells[2] = 3;
        cells[3] = 4;
        List<String> name = new ArrayList<>();
        name.add("kakawa");
        name.add("maxi");
        name.add("trulala");
        for (String nam : name){
            System.out.println(nam+ " Красавчик");

        }

        for (int cell : cells){
            if (cell== 2){
                System.out.println("это 2 ");
            }else {
                System.out.println("это не 2");
            }
        }
    }

}
