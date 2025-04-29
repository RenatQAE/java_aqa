package lesson11;

import java.time.LocalDateTime;

public class EncapsulationDemo {

    public static void main(String[] args) {
        // Защита состояние
        // скрытие реализации
        LocalDateTime now = LocalDateTime.now();

        Lesson lesson1 = new Lesson();
        lesson1.getLector();
        lesson1.getTopic();


    }

}
