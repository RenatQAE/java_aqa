package PlayGround.lesson0711;

public class Car {

    String brand;
    String model;
    double engineV;
    int year;
    int price;
    String color;

    public Car(){
        System.out.println("Created");

    }

    public Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}
