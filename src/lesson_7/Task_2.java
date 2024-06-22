package lesson_7;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<String> deals = new ArrayList<>();

        deals.add("run 5 km");
        deals.add("to take a shower");
        deals.add("breakfast");
        deals.add("prepare for work");
        deals.add("start working");

        for (int i = 0; i < deals.size(); i++) {
            System.out.println("Deals for today " + (i + 1) + ": " + deals.get(i));

        }
    }
}
