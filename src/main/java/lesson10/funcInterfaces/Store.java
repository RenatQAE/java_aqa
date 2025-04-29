package lesson10.funcInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {


        Item item1 = new Item("Яблоко", 100,5.5);
        Item item2 = new Item("Груша", 120,4.1);
        Item item3 = new Item("Апельсин", 110,9.9);


        // вывести товары на экран по цене, по названию, по рейтингу
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        //задача на поиск max / min
        // сортировка по цене
        items.sort((a,b)->a.price() - b.price());
        System.out.println(items);
        // сортировка по рейтингу
        items.sort((a,b)-> (int) (a.rating() - b.rating()));
        System.out.println(items);



    }
}
