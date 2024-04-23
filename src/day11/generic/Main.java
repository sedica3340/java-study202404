package day11.generic;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple(10));

        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana(15));

        Banana banana = bb.getBanana();

        Basket<Apple> appleBasket = new Basket<Apple>();

        appleBasket.setFruit(new Apple(123));
        Basket<Banana> bananaBasket = new Basket<Banana>();

        bananaBasket.setFruit(new Banana(88));
    }
}
