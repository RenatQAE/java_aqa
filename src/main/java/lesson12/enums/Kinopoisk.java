package lesson12.enums;

public class Kinopoisk {
    public static void main(String[] args) {


        Movie m1 = new Movie("Довод",GenreEnum.SCI_FI);
        Movie m2 = new Movie("Интерстеллар",GenreEnum.ACTION);
        Movie m3 = new Movie("Марсианин",GenreEnum.COMEDY);


        new Movie("Терминатор",GenreEnum.ACTION);


        System.out.println(GenreEnum.COMEDY.getRusName());
        System.out.println(GenreEnum.ACTION .getRusName());
        System.out.println(GenreEnum.SCI_FI.getRusName());



    }
}
