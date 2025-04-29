package lesson11;

import java.util.Objects;

public class Lesson {

 private String topic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(topic, lesson.topic) && Objects.equals(lector, lesson.lector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, lector);
    }

    public String getLector() {
        return lector;
    }

    public String getTopic() {
        return topic;
    }

    private  String lector;

}
