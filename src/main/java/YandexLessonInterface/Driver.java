package YandexLessonInterface;

public class Driver {
    private final String driverFirstName;
    private final String driverSurName;

    public Driver(String driverFirstName, String driverSurName) {
        this.driverFirstName = driverFirstName;
        this.driverSurName = driverSurName;
    }
    public String getFullNameDriver(){

        return driverFirstName + " "+ driverSurName;
    }
}
