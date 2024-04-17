package day07.modi.pac2;

import day07.modi.pac1.A;
//import day07.modi.pac1.B;
public class C {

    public  int y1;
    int y2;
    private int y3;

    void test() {
        A a1 = new A(100);//    public
//        A a2 = new A(5.5); //    default
//        A a3 = new A(true);//    private

        a1.f1 = 10;
//        a1.f2 = 20;
//        a1.f3 = 30;

        a1.m1();
//        a1.m2();
//        a1.m3();

    }
}
