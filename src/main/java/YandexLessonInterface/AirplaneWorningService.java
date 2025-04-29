package YandexLessonInterface;

public class AirplaneWorningService extends AbstractBookingService{
    @Override
    public void book(int bookingId, Driver driver) {
        System.out.println("Заказ №"+bookingId+"airplane"+driver.getFullNameDriver());
        bookingsCount ++;

    }

    @Override
    public void cancel(int bookingId) {
        if (bookingsCount == 0){
            System.out.println("Нет броней к отмене на самолеты");
        }else {
            System.out.println("Отменяет заказ самолета № "+bookingId);
            bookingsCount --;

        }

    }

    @Override
    public int getBookingsCount() {
        return bookingsCount;

    }
}
