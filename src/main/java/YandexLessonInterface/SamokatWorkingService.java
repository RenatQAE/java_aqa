package YandexLessonInterface;

public class SamokatWorkingService extends AbstractBookingService {


    public void book (int id, Driver driver) {
        System.out.println("Заказ № " + id + " Самокатчик: " + driver.getFullNameDriver());
        bookingsCount++;
    }

    public void cancel(int id) {
        if ((bookingsCount == 0)) {
            System.out.println("Нет броней к отмене у самокатчика");
        } else {
            System.out.println("Отменяем заказ самокатчика №");
            bookingsCount--;
        }
    }
    public int getBookingsCount(){
        return bookingsCount;
    }
}

