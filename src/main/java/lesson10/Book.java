package lesson10;

public record Book(String title, int year,String author) {

    public String getFullInfo(){
        return title+": "+author+" "+year;
    }
}
