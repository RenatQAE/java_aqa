package lesson_7;

import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private String year;
    private List<String> films;


    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", films=" + films +
                '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(year, company.year) && Objects.equals(films, company.films);
    }


    public int hashCode() {
        return Objects.hash(name, year, films);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Company(String name, List<String> films, String year) {
        this.name = name;
        this.films = films;
        this.year = year;
    }
}
