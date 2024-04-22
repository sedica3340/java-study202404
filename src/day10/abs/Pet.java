package day10.abs;

public abstract class Pet {

    String name;
    int age;
    String kind;

    public Pet() {

    }
    public abstract void eat();
    public abstract void sleep();

    public void play() {
        System.out.println(this.getClass().getName());
    }
}
