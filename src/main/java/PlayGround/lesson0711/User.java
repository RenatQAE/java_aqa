package PlayGround.lesson0711;

public class User {

    String name;
    int age;
    String phone;
    String email;
    double rating;
    boolean isOnline;

    public void UserNameAge(String name, int age){
        System.out.println("I was born");
        name = this.name;
        age = this.age;
    }
    public void getOlder(){
        age = age ++;
        System.out.println("сегодня я стал старше");
        System.out.println(age);

    }
}
