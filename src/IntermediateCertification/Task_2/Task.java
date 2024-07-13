package IntermediateCertification.Task_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Task {

    public static void main(String[] args) {

        System.out.println("Введите дату последнего полива в формате dd.MM.yyyy: , где dd - день, MM - месяц, yyyy - год");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        boolean isData = false;

        Scanner scanner = new Scanner(System.in);
        LocalDate lastWaterDate = null;

        do { //контроль ввода даты
            try {
                String inputDate = scanner.nextLine();
                lastWaterDate = LocalDate.parse(inputDate, formatter);
                isData = true;
            } catch (DateTimeParseException e) {
                System.out.println("Пожалуйста, введите дату в формате dd.MM.yyyy , где dd - день, MM - месяц, yyyy - год");
            }
        } while (!isData);

        WateringPlan myCactus = new Cactus("Кактус");
        LocalDate nextWaterDate = myCactus.waterPlants(lastWaterDate);
        System.out.println("Внимание, дата следующего полива Кактуса: "+nextWaterDate.format(formatter));
    }
}