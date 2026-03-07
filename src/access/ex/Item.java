package access.ex;

public class Item {
    String itemName;
    int itemPrice;
    int itemQuantity;

    public Item(String itemName, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getTotalPrice() {
        return itemPrice * itemQuantity;
    }
}
