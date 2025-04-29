package YandexLessonInterface;

public class DriverWorkingService extends AbstractBookingService {

    public void book(int id, Driver driver) {
        System.out.println("Заказ № " + id + " Водитель: " + driver.getFullNameDriver());
        bookingsCount++;
    }

    public void cancel(int id) {
        if ((bookingsCount == 0)) {
            System.out.println("Нет броней к отмене ");
        } else {
            System.out.println("Отменяем заказ водителя на авто №");
            bookingsCount--;
        }
    }
    public int getBookingsCount(){
        return bookingsCount;
    }
}
