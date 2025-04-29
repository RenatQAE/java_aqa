package lesson12.generics;

public class Playground {
    public static HttpResponce main(String[] args) {
    HttpResponce data = getData();
    String body = data.getBody();
        return data;
    }




    private static HttpResponce getData(){
            return new HttpResponce(200,"Hello world!");

    }
}
