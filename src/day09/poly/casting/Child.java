package day09.poly.casting;

public class Child extends Parent{

    int c1;


    @Override
    public void method1() {
        System.out.println("Overriding 한 Child 의 method1");
    }

    public void method2() {
        System.out.println("Child 의 method2");
    }
}
