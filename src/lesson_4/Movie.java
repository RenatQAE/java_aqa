package lesson_4;

import java.util.Objects;

public class Movie {

    String name;
    double rating;
    String genre;
    String country;
    boolean isWithOscar;


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(rating, movie.rating) == 0 && isWithOscar == movie.isWithOscar && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(country, movie.country);
    }


    public int hashCode() {
        return Objects.hash(name, rating, genre, country, isWithOscar);
    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", isWithOscar=" + isWithOscar +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public boolean isWithOscar() {
        return isWithOscar;
    }

    public Movie(String name, boolean isWithOscar, String country, String genre, double rating) {
        this.name = name;
        this.isWithOscar = isWithOscar;
        this.country = country;
        this.genre = genre;
        this.rating = rating;
    }

    }

