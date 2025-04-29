package lesson10.funcInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Item item1 = new Item("Яблоко", 100, 5.5);
        Item item2 = new Item("Груша", 120, 4.1);
        Item item3 = new Item("Апельсин", 110, 9.9);


        // вывести товары на экран по цене, по названию, по рейтингу
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        List<Item> filtered = new ArrayList<>();

        Predicate<Item> priceIsLessThan111 = new Predicate<Item>() {
            @Override
            public boolean test(Item item) {
                return item.price() < 111;
            }
        };

}}
