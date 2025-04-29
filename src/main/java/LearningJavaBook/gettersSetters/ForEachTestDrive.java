package LearningJavaBook.gettersSetters;

public class ForEachTestDrive {
    public static void main(String[] args) {

        int[] number = new int[5];
        number[0]= 99;
        number[1]= 75;
        number[2]= 33;
        number[3]= 14;
        number[4]= 71;

        for (int num : number){
            if (num > 70){

                System.out.println(num+" Число больше 70");
            }else {
                System.out.println(num+ " Число меньше 70");
            }


        }

    }


}
