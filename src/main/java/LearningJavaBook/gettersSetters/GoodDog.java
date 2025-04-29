package LearningJavaBook.gettersSetters;

public class GoodDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void bark(){
        if (size>60){
            System.out.println("ГАВ ГАВ!");
        } else if (size>14) {
            System.out.println("ВУФ ВУФ");
        }else {
            System.out.println("ТЯФ ТЯФ");
        }
    }
}
