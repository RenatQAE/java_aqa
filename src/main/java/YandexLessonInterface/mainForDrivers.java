package YandexLessonInterface;

public class mainForDrivers {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Renat","Sharafutdinov");
//        DriverWorkingService driverWorkingService = new DriverWorkingService();
//        driverWorkingService.bookDrive(1,driver1);
//        driverWorkingService.cancel(1);
//        System.out.println(driverWorkingService.getCurrentBookingCount());

//        SamokatWorkingService samokatWorkingService = new SamokatWorkingService();
//        samokatWorkingService.bookSamokat(1,driver1);

        WorkingService workingService = new AirplaneWorningService();
        workingService.book(1,driver1);
        workingService.book(2,driver1);
        workingService.book(3,driver1);
        System.out.println(workingService.getBookingsCount());
        workingService.cancel(1);
        System.out.println(workingService.getBookingsCount());
    }
}
