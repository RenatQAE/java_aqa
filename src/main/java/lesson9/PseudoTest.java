package lesson9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PseudoTest {
    public static void main(String[] args) throws IOException {
        String url = "";
        String user = "";
        String pass = "";
        List<String> strings = Files.readAllLines(Path.of("C:\\Users\\Renat\\OneDrive\\Desktop\\YandexPracticumeEdu\\dataTest"));
        for (String prop : strings) {
            String[] split = prop.split(": ");

            switch (split[0]) {
                case "url":
                    url = split[1];
                    break;
                case "user":
                    user = split[1];
                    break;
                case "pass":
                    pass = split[1];
                default:
                    System.out.println("неизвестное значение"+ split[0]+":"+split[1 ]);
            }
        }

        // open url
        System.out.println("Открываем страницу " + url);
        // type username in
        System.out.println("Вводим логин " + user);
        // type pass
        System.out.println("Вводим пароль " + pass);

        //"a/b/c/d"
        strings.get(0).split(" :");

    }
}
