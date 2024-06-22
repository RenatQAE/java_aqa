package lesson_7;

import lesson_4.Movie;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();

        films.add(new Movie("Operation Condor",false,"China+USA","Action",6.5));
        films.add(new Movie("Pirates of the Coribbean",true,"USA","Fantasy",7.2));
        films.add(new Movie("Naruto",false,"Japan","Anime",9.3));
        System.out.println(films.get(1));
    }

}
