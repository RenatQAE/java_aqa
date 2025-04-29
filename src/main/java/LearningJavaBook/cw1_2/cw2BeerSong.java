package LearningJavaBook.cw1_2;

public class cw2BeerSong {
    public static void main(String[] args) {

        int beerNum = 99;
        String word = "Бутылок";

        while (beerNum >0){
            if (beerNum == 1 ){
                word = "Бутылка";
            }
            if (beerNum == 4 || beerNum ==3 || beerNum == 2) {
                word = "Бутылки";
            }
            System.out.println(beerNum+ " "+ word + " Пива на стене");
            System.out.println(beerNum+ " "+ word + " Пива");
            System.out.println("Возьми одну");
            System.out.println("Пусьти по кругу");
            beerNum = beerNum -1;
            if (beerNum> 0){
                System.out.println(beerNum + " "+word + " Пива на стене");
            }else {
                System.out.println("Нет бутылок пива на стене");
            }// конец else
        } // конец while
    }  // конец метода main
}     // конец класса
