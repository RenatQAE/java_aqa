package lesson_3;

public class task_3 {
    public static void main(String[] args) {


        Item item1 = new Item("Айфон", "Серый", 420141, 3, 149990.9);
        Item item2 = new Item("Компуктер", "Белый", 111011, 1, 219149.5);
        Item item3 = new Item("Наушники", "Красный", 89041, 11, 9990);
        Item item4 = new Item("Гитара", "Желтый", 149202, 5, 11290.9);
        Item item5 = new Item("Плейстейшн", "Черный", 87211, 8, 25890);


        System.out.println("Артикул:" + item1.itemArticle + " Название:" + item1.itemName + " Цена:" + item1.itemCost + " Количество:" + item1.itemCount + " Цвет:" + item1.itemColor);
        System.out.println("Артикул:" + item2.itemArticle + " Название:" + item2.itemName + " Цена:" + item2.itemCost + " Количество:" + item2.itemCount + " Цвет:" + item2.itemColor);
        System.out.println("Артикул:" + item3.itemArticle + " Название:" + item3.itemName + " Цена:" + item3.itemCost + " Количество:" + item3.itemCount + " Цвет:" + item3.itemColor);
        System.out.println("Артикул:" + item4.itemArticle + " Название:" + item4.itemName + " Цена:" + item4.itemCost + " Количество:" + item4.itemCount + " Цвет:" + item4.itemColor);
        System.out.println("Артикул:" + item5.itemArticle + " Название:" + item5.itemName + " Цена:" + item5.itemCost + " Количество:" + item5.itemCount + " Цвет:" + item5.itemColor);



    }

}
