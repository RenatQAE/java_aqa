package PlayGround.lesson0711;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void up(double rate){
        if (rate >= 1){
            this.salary = this.salary * rate;
            System.out.println("твоя зп увеличена, новая зп=" +salary);
        }
    }
    public void down(double rate){
        if (rate >0.5){
            rate = 0.5;
        }
        
        if (rate < 0){
            rate = 0;
        }
        this.salary = this.salary * (1-rate);
    }

}
