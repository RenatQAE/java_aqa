package lesson7.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Company c1 = new Company("MGM", 1927);
        Company c2 = new Company("WB", 1900);
        Map<Company, Integer > filmsCompany = new HashMap<>();

        filmsCompany.put(c1,100);
        filmsCompany.put(c2,222);
        Integer integer = filmsCompany.get(c1);
        Integer integer1 = filmsCompany.get(c2);
        System.out.println(integer);
        System.out.println(integer1);

        Film film1 = new Film("Lotr");
        List<Company> companyList = new ArrayList<>();

        c1.getFilmList().add(new Film("Doom"));
        c1.getFilmList().add(new Film("Doom-2"));
        c1.getFilmList().add(new Film("Doom-3 Be-Be"));
        System.out.println(c1.getFilmList().size());
        System.out.println(c1.toString() );
        companyList.add(c1);
        companyList.add(c2);
    }
}
