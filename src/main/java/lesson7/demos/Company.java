package lesson7.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private int year;

    private List<Film> filmList;

    public List<Film> getFilmList() {
        return filmList;
    }

    public Company(String name, int year) {
        this.name = name;
        this.year = year;
        this.filmList = new ArrayList<>();
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return year == company.year && Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
