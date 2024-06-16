package lesson_4;

public class MovieArray {
    public static void main(String[] args) {

        Movie[] films = new Movie[3];

        films[0] = new Movie("LOTR", true, "USA", "Fantasy", 9.1);
        films[1] = new Movie("Batman", true, "USA", "Superheroes", 8.5);
        films[2] = new Movie("Japan history", false, "Japan", "Historical", 5.7);

        for (int i = 0; i < films.length; i++) {
            String top = "Название: " + films[i].name + " Страна: " + films[i].country + " Жанр: " + films[i].genre + " Рейтинг: " + films[i].rating + " Есть оскар: " + films[i].isWithOscar;
            System.out.println(top);
        }
        //for (int joke = 1; joke < 1000000000; joke = joke + 1) {
        //   System.out.println(joke);  в комменте что бы не ждать

        String[] Players = new String[10];

        Players[0] = "Monesy";
        Players[1] = "Niko";
        Players[2] = "jks";
        Players[3] = "ZyWoo";
        Players[4] = "donk";
        Players[5] = "Perfecto";
        Players[6] = "Shiro";
        Players[7] = "electronic";
        Players[8] = "Cadian";
        Players[9] = "Guardian";

        for (int ii = 0; ii < 3; ii = ii + 1) {
            String names = Players[ii];
            System.out.println(names);


        }

    }
}




