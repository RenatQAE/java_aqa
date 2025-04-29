package lesson7;

import lesson6.User;

import java.util.HashMap;
import java.util.Map;

public class ObjectMethods {
    public static void main(String[] args) {


        Book bookDb = new Book("1234-4","12 стульев", "И.Ильф",1927);
        Book bookJson = new Book("1234-4","12 стульев", "И.Ильф",1927);
        Book bookRen = new Book("222","LOTR", "J.R.R.Tolkien",0);

        Map<Book, User> library = new HashMap<>();
        library.put(bookDb,new User("alex"));
        System.out.println(library.get(bookJson).getEmail());
        System.out.println(library.get(bookJson).getName());
        System.out.println(bookJson.toString())
        ;
        Map<Integer, String>test = new HashMap<>();
    }
}
