package LearningJavaBook.cw1_2;

public class cw2While {
    public static void main(String[] args) {
        // while
        int x = 1;
        System.out.println("Перед началом цикла");
        while (x < 4){
            System.out.println("Внутри цикла");
            System.out.println("Значения х равно "+x);
            x = x +1;
        }
        System.out.println("После окончания цикла");
    }
}
