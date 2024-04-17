package day07.encap.practice;

public class Product {
    private String name;
    private int price;
    private int stack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stack;
    }

    public void setStock(int stack) {
        this.stack = stack;
    }
    public void reduceStock(int i) {
        if(i <= this.stack) {
            this.stack -= i;
        }
    }
}
//        // Product 클래스 테스트
//        Product product = new Product();
//        product.setName("Laptop");
//        product.setPrice(1200000);
//        product.setStock(30);
//        System.out.println("상품명: " + product.getName());
//        System.out.println("상품 가격: " + product.getPrice());
//        System.out.println("재고 수량: " + product.getStock());
//        product.reduceStock(5);
//        System.out.println("판매 후 수량: " + product.getStock());