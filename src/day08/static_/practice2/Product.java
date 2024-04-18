package day08.static_.practice2;
import static day08.static_.practice2.Store.addSale;
public class Product {
    private String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
    public void sellProduct() {
        addSale(this.price);
    }
}
