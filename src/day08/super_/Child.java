package day08.super_;

public class Child extends Parent{

//    int a;
//    double b;
    boolean c;

    Child() {
        this(100);
        System.out.println("Child 클래스의 생성자 호출!");
        this.c = true;
    }
    Child(int x) {
        System.out.println("Child 클래스의 두번째 생성자 호출");
    }
    void childMethod() {
        System.out.println("Child a = " + this.a);
        System.out.println("Child b = " + this.b);
        System.out.println("Child c = " + this.c);
    }
}
