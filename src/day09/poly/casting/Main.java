package day09.poly.casting;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 100;
        child.p1 = 200;

        child.method1();
        child.method2();

        Parent parent = new Parent();
//        parent.c1 = 30
        parent.p1 = 25;

        parent.method1();

        Child child2 = new Child();
//        child2.c1 = 250;
        child2.p1 = 300;

        child2.method1();
//        child2.method2();

        Parent[] pArr = {child2};
        Parent pp = child2;
    }
}
