package lesson8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesDemo {
    public static void main(String[] args) {


        System.out.println(LocalDate.now());

        LocalDate date1 = LocalDate.of(2024,2,11);
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("2024-10-24");
        System.out.println(date2);

        LocalDate date3 = date2.plusDays(123);
        System.out.println(date3);
        LocalDate date4 = date3.minusYears(3);
        System.out.println(date4);

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        LocalTime time2 = LocalTime.parse("22:11:33");
        System.out.println(time2);
        LocalTime time3 = time2.plusMinutes(43);
        System.out.println(time3);
        LocalDateTime dt1= LocalDateTime.now();
        System.out.println(dt1);
        LocalDateTime dt2 = LocalDateTime.of(LocalDate.now(),LocalTime.now());

        // pattern = Шаблон
        // yyyy year
        // MM month
        // dd day

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String form = dateTimeFormatter.format(dt2);
        System.out.println(form);

}}
