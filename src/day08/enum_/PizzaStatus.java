package day08.enum_;

public enum PizzaStatus {

    ORDERED("주문완료", 10), READY("준비완료", 5), DELIVERED("배달완료", 0);

    private String description;
    private int timeToSetup;
    PizzaStatus(String description, int timeToSetup) {
        this.description = description;
        this.timeToSetup = timeToSetup;
    }

    public String getDescription() {
        return description;
    }

    public int getTimeToSetup() {
        return timeToSetup;
    }
}
