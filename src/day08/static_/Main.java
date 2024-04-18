package day08.static_;

import util.SimpleInput;

import static java.lang.System.*;
import static util.SimpleInput.input;
import static java.lang.Math.random;
import static java.lang.System.out;
import static day08.static_.Count.m1;

public class Main {

    public static void main(String[] args) {
        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();
        c2.m2();
        c1.y = 10;

        Count.x = 99;
        Count.x = 50;

        out.println("c1.y = " + c1.y);
        out.println("c2.y = " + c2.y);
        out.println("c1.x = " + Count.x);
        out.println("c2.x = " + Count.x);


        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

        double r5 = Calculator.calcArea(5);

        redCal.paint("red");
        blueCal.paint("blue");
//        String name = input("이름: ");

        double random = random();

        out.println();

        m1();



        out.println("===================");

        out.println(Person.nation);

        Person gap = new Person("갑돌리", 20);

        out.println(gap.name);
        out.println(gap.age);
        out.println(gap.nation);
    }
}
