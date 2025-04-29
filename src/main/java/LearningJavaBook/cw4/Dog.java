package LearningJavaBook.cw4;

public class Dog {
    int size;
    String name;
    private int smileNum = 3;

    void bark(){

        if (size > 60){
            System.out.println("МОЩНЫЙ ГАВ ГАВ!");
        } else if (size >14 ) {
            System.out.println("Вуф вуф ауф");
        }else {
            System.out.println("Тяф тяф ууу");
        }
    }
    void smile(int smileNum){
        while (smileNum > 0)
        System.out.println("улыбаюсь");
          smileNum --;     }
}
