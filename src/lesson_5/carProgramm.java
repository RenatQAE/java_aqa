package lesson_5;

public class carProgramm {
    public static void main(String[] args) {


        Car car = new Car("BMW", 0);
        System.out.println(car.getCurrentSpeed());

        car.speedUp(25);
        System.out.println(car.getCurrentSpeed());

        car.breaak();
        System.out.println(car.getCurrentSpeed());

        car.breaak();
        System.out.println(car.getCurrentSpeed());


// тут 0
        car.breaak();
        System.out.println(car.getCurrentSpeed());
    }
}
