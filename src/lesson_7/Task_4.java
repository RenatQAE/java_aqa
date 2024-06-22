package lesson_7;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<String> films1 = new ArrayList<>();
        films1.add("Пираты Карибского моря 1");
        films1.add("Пираты Карибского моря 2");
        films1.add("Пираты Карибского моря 3");

        List<String> films2 = new ArrayList<>();
        films2.add("Властелин колец 1");
        films2.add("Властелин колец 2");
        films2.add("Властелин колец 3");

        List<String> films3 = new ArrayList<>();
        films3.add("Мстители 1");
        films3.add("Мстители 2");
        films3.add("Мстители 3");

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("New line Cinema",films2, "2001"));
        companies.add(new Company("Marvel",films3, "2000"));
        companies.add(new Company("Disney",films1, "2003"));

        for (Company company : companies){
            System.out.println(company);
        }

    }

}
