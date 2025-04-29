package lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Counter {
    public static void main(String[] args) throws IOException {
        Path filepath2 = Path.of("counter"); //1

        if (Files.exists(filepath2)){
        String content = Files.readString(filepath2); // "1"
        // действия с файлами
        int value = Integer.parseInt(content);
        value += 1;

        String newcontent = String.valueOf(value);
        Files.writeString(filepath2, newcontent);
    }else {
            Files.writeString(filepath2,"0");
        }
    }
}
