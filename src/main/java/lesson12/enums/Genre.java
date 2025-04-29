package lesson12.enums;

import java.util.Objects;

public class Genre {

//    public static final String SCI_FI = "Фантастика"; //42
    public static final Genre SCI_FI = new Genre("Фантастика",42);
//    public static final String ACTION = "Приключения"; //7
    public static final Genre ACTION = new Genre("Приключения",7);
//    public static final String COMEDY = "Комедия"; //101
    public static final Genre COMEDY = new Genre("Комедия",2);


    private String name;
    private int code;

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }

    private Genre(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return code == genre.code && Objects.equals(name, genre.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }

    public String getName() {
        return name;
    }

    public int getCode(){
        return code;
    }

}
