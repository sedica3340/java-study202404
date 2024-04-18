package day08.enum_;

public class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza();
        p.orderPizza("파인애플피자");
        System.out.println("현황: " + p.getStatus().getDescription() + "\n남은시간: " + p.getStatus().getTimeToSetup());
        p.readyPizza();
        System.out.println("현황: " + p.getStatus().getDescription() + "\n남은시간: " + p.getStatus().getTimeToSetup());
        p.deliverPizza();
        System.out.println("현황: " + p.getStatus().getDescription() + "\n남은시간: " + p.getStatus().getTimeToSetup());
    }
}
