package IntermediateCertification.Task_2;

import java.time.LocalDate;
import java.util.Objects;

public class Cactus implements WateringPlan {

    String KindOfCactus;

    public Cactus(String kindOfCactus) {
        KindOfCactus = kindOfCactus;
    }

    public Cactus() {
    }

    public String getKindOfCactus() {
        return KindOfCactus;
    }

    public void setKindOfCactus(String kindOfCactus) {
        KindOfCactus = kindOfCactus;
    }

    @Override
    public LocalDate waterPlants(LocalDate lastWaterDate) {

        LocalDate waterDate;
        int month = lastWaterDate.getMonthValue();
        int days = lastWaterDate.getDayOfMonth();
        int daysInMonth = lastWaterDate.lengthOfMonth();

        // месяцы [1;12] где 1 - январь, 12 - декабрь
        switch (month) {
            case 12, 1: //если декабрь, январь
                return lastWaterDate.plusMonths(1);
            case 2: //февраль
                if (days < 7) {
                    return lastWaterDate.plusMonths(
                            1);
                } else {
                    return lastWaterDate.plusDays(daysInMonth - days
                            + 7);
                }
            case 3, 4, 9, 10, 11:
                return lastWaterDate.plusWeeks(1);
            case 5:
                if (days > 24) {
                    return lastWaterDate.plusDays(
                            daysInMonth - days + 1);
                } else {
                    return lastWaterDate.plusWeeks(1);
                }
            case 6, 7, 8:
                int humidity = new HumiditySensorImplements().getHumiditySensor();
                int humiditySensor = Integer.parseInt(String.valueOf(humidity));
                if (humiditySensor > 30) {
                    return lastWaterDate.plusDays(2);
                } else {
                    return lastWaterDate.plusDays(1);
                }
            default:
                break;
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cactus cactus = (Cactus) o;
        return Objects.equals(KindOfCactus, cactus.KindOfCactus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(KindOfCactus);
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "KindOfCactus='" + KindOfCactus + '\'' +
                '}';
    }
}