package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A {

    D() {
        super(100);

        f1 = 100; //protected
//        f2 = 200; // default

        m1();   //protected;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
//        m2();
    }

    void test() {
        A a = new A();

    }
}
