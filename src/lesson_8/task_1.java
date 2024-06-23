package lesson_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class task_1 {
    public static void main(String[] args) {

        LocalDate publishDate = LocalDate.now().minusDays(0);
        LocalTime publishTime = LocalTime.now().minusMinutes(60);

        LocalDateTime eventTimeStamp = LocalDateTime.of(publishDate, publishTime);

        DurationTest HumanReadableTimestamp = new DurationTest();
        String result = HumanReadableTimestamp.getTimestamp(eventTimeStamp);
        System.out.println(result);

    }
}
