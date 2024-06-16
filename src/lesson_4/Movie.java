package lesson_4;

public class Movie {

    String name;
    double rating;
    String genre;
    String country;
    boolean isWithOscar;

    public Movie(String name, boolean isWithOscar, String country, String genre, double rating) {
        this.name = name;
        this.isWithOscar = isWithOscar;
        this.country = country;
        this.genre = genre;
        this.rating = rating;
    }
}
