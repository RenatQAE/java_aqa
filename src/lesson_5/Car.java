package lesson_5;



public class Car {
    String brand;
    String model;
    double engineV;
    int year;
    int price;
    String color;
    private int currentSpeed = 0;

    public Car(String brand, int currentSpeed) {
        this.brand = brand;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp(int speed) {
        this.currentSpeed = this.currentSpeed + speed;
    }

    public void breaak() {
        if (this.currentSpeed - 10 < 0) {
            this.currentSpeed = 0;
        } else {
            this.currentSpeed = this.currentSpeed - 10;
        }
    }
}