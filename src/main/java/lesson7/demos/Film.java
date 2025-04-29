package lesson7.demos;

import java.util.Objects;

public class Film {

    public String title;

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(title, film.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    public String getTitle() {
        return title;
    }

    public Film(String title) {
        this.title = title;
    }
}
