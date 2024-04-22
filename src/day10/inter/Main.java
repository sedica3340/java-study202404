package day10.inter;

public class Main {

    public static void main(String[] args) {

        System.out.println(SmartPhone.age);
        Galaxy galaxy = new Galaxy();
        IPhone iPhone = new IPhone();
        SmartPhone[] smartPhones = {galaxy, iPhone};
    }
}
