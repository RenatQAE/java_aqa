package lesson12.enums;

import java.util.Objects;

public class Rating {

    public static final Rating R_1 = new Rating(1);
    public static final Rating R_2 = new Rating(2);
    public static final Rating R_3 = new Rating(3);
    public static final Rating R_4 = new Rating(4);
    public static final Rating R_5 = new Rating(5);

    private int rating;

    @Override
    public String
    toString() {
        return "Rating{" +
                "rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating1 = (Rating) o;
        return rating == rating1.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rating);
    }

    public int getRating() {
        return rating;
    }

    private Rating(int rating) {
        this.rating = rating;
    }
}
