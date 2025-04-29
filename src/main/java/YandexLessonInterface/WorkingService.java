package YandexLessonInterface;

public interface WorkingService {

    void book(int bookingId, Driver driver);

    void cancel(int bookingId);

    int getBookingsCount();
}
