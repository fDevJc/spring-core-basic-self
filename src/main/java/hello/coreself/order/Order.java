package hello.coreself.order;

public class Order {
    private Long id;
    private String itemName;
    private int price;
    private int discountPrice;

    public Order(Long id, String itemName, int price, int discountPrice) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }
}
