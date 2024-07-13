package IntermediateCertification.Task_2;

import java.util.Random;

public class HumiditySensorImplements implements HumiditySensor {

    int humiditySensor;

    @Override
    public int getHumiditySensor() {
        return makeHumiditySensor(humiditySensor);
    }

    @Override
    public int makeHumiditySensor(int humiditySensor) {
        Random random = new Random();
        humiditySensor = 7 + random.nextInt(100);
        System.out.println("Влажность: " + humiditySensor);
        return humiditySensor;
    }
}