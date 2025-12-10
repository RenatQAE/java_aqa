package lesson9;

public class Start1 {
    public static void main(String[] args) {

    Car myCar = new Car("mazda","CX-8");
    Car myCar2 = new Car("LADA","VESTA");
    myCar.year = 10;
        System.out.println(myCar.year);

    myCar.yearToRetirement();
        System.out.println(myCar.year);
        myCar.aboutMe();
        myCar2.aboutMe();
        myCar2.setName("RENATKA");
        myCar2.setColor("BLACK");
        myCar2.getName();
        myCar2.getColor();
        myCar2.aboutMe();
    }



}