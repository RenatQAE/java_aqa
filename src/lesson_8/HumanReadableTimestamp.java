package lesson_8;

import java.time.LocalDateTime;

public interface HumanReadableTimestamp {
    String getTimestamp(LocalDateTime eventTimestamp);

}
