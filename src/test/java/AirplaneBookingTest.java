import YandexLessonInterface.AirplaneWorningService;
import YandexLessonInterface.Driver;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirplaneBookingTest {

    @Test

    public void getTotalBookingsCountIsIncreasedThen1Booking() {
        AirplaneWorningService airplaneWorningService = new AirplaneWorningService();
        Driver driver1 = new Driver("Jarvis", "Marvin");
        int expected = 1;
        airplaneWorningService.book(1, driver1);
        int actual = airplaneWorningService.getBookingsCount();

        String driverName = "Aline";


        assertEquals(expected,actual,"Total booking count is not currect");
        System.out.println(driverName.equals(driver1));
    }
}