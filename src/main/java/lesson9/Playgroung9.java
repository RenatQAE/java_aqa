package lesson9;

import lesson7.demos.Film;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Playgroung9 {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("./test.txt");
        try {

            Files.writeString(filePath, "Галина Смирнова");
        }catch (Exception e){
            System.out.println("Сломал");
        }
        try {
            Files.writeString(filePath,"\n",StandardOpenOption.APPEND);
            Files.writeString(filePath,"Полина Мимикова",StandardOpenOption.APPEND);


        }catch (Exception e){
            System.out.println("Сломал тут");
        }
        String s = Files.readString(filePath);
        System.out.println(s);

        List<String> a = Files.readAllLines(filePath);
        System.out.println(a);








    }
}