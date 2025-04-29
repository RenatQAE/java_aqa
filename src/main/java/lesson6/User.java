package lesson6;

public class User {
    private String name;
    private int age;
    private String email;
    private double rating;
    private boolean isOnline;
    private int balance;
    private String phone;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void notifyEmail(String message){
        System.out.println("Уведомляем юзера на почту "+ email+":"+ message);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
}

