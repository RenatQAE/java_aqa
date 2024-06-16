package lesson_3;

public class Flat {
    String flatLocation; // Адрес расположения квартиры
    int flatRooms; // количество комнат
    double flatArea; // Общая площадь квартиры
    int flatFloor; // этаж расположения квартиры
    boolean isWithBalcony; // наличие балкона


    public Flat(String flatLocation, boolean isWithBalcony, int flatFloor, double flatArea, int flatRooms) {
        this.flatLocation = flatLocation;
        this.isWithBalcony = isWithBalcony;
        this.flatFloor = flatFloor;
        this.flatArea = flatArea;
        this.flatRooms = flatRooms;
    }
}
