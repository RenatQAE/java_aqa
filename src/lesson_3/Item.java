package lesson_3;

public class Item {
    String itemName;
    double itemCost;
    int itemCount;
    int itemArticle;
    String itemColor;

    public Item(String itemName, String itemColor, int itemArticle, int itemCount, double itemCost) {
        this.itemName = itemName;
        this.itemColor = itemColor;
        this.itemArticle = itemArticle;
        this.itemCount = itemCount;
        this.itemCost = itemCost;
    }
}
