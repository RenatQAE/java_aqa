package lesson12.enums;

public enum GenreEnum {
    SCI_FI("Фантастика",42),
    ACTION("Приключения",101),
    COMEDY("Комедия", 7);


    // GenreEnum SCI_FI = new GenreEnum();
    // GenreEnum ACTION = new GenreEnum();
    // GenreEnum COMEDY = new GenreEnum();

    private String rusName;
    private int code;

    GenreEnum(String rusName, int code) {
        this.rusName = rusName;
        this.code = code;
    }

    public String getRusName() {
        return rusName;
    }

    public int getCode() {
        return code;
    }
}


