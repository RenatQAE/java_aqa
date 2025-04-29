package LearningJavaBook.cw1_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class hw1 {
    public static void main(String[] args) {
        int size = 27;
         String name = "Fido";
        Dog myDog = new Dog(size, name);
        int x = size -5;
        if (( x < 15)){
            myDog.bark("ав гав гав");
        }else {
            System.out.println(" скулим !");
        }
        while (x > 3){
            myDog.play("Я играю я играю, ура ура");
            break;
        }

        int [] numList = {2,4,6,7};
        System.out.println("hello");
        System.out.println("dog + "+ myDog.getName());
        String num = "8";
        int z = Integer.parseInt(num);
        System.out.println(z);

        try {
           Files.readAllLines(Path.of("https/"));
        }catch (FileNotFoundException ex){
            System.out.println("File not fould");
        } catch (IOException e) {
            throw new
                    RuntimeException(e);

        }
    }
}
