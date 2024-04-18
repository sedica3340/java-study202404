package day08.enum_;

public class Pizza {

    private String pizzaName;
    private PizzaStatus status; // 주문중, 요리준비중, 요리중, 배달중, 배달완료 ...;

    public void orderPizza(String pizzaName) {
        this.status = PizzaStatus.ORDERED;
        this.pizzaName = pizzaName;
        System.out.println("피자 주문이 들어왔습니다.");
    }

    public void readyPizza() {

        if (this.status == PizzaStatus.ORDERED) {
            this.status = PizzaStatus.READY;
            System.out.println("피자가 준비되었습니다.");
        } else {
            System.out.println("피자 주문이 없습니다.");
        }

    }
    public void deliverPizza() {
        if (this.status == PizzaStatus.READY) {
            this.status = PizzaStatus.DELIVERED;
            System.out.println("피자가 배달되었습니다.");
        } else {
            System.out.println("피자가 아직 요리중입니다.");
        }
    }

    public PizzaStatus getStatus() {
        return status;
    }
}
