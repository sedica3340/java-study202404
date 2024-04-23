package day11.generic;

public class Apple {
    private int sweet;

    public Apple(int sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "sweet=" + sweet +
                '}';
    }
}
