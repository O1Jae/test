package assyong.polymorphismT.p_static.extend_p;

public class Item {
    private String name;
    private int price;

    private Item() {}

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
