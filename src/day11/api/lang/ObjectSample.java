package day11.api.lang;

import java.util.Objects;
import java.util.Scanner;

class Pen {

    long serial; //
    String color;
    int price;
    Company company;

    public Pen(long serial, String color, int price, Company company) {
        this.serial = serial;
        this.color = color;
        this.price = price;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return serial == pen.serial && Objects.equals(color, pen.color) && Objects.equals(company, pen.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color, company);
    }
}

class Company {
    String companyName;
    String address;

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

public class ObjectSample {
    public static void main(String[] args) {

        Company company = new Company("모나미", "서울");
        System.out.println("company = " + company);

        Pen yellowPen = new Pen(100L, "노랑", 1000, company);

        String cName = yellowPen.company.companyName;
        System.out.println("cName = " + cName);
        System.out.println("yellowPen = " + yellowPen);

        Pen bluePen = new Pen(200L, "blue", 1200, new Company("zetstream", "도쿄"));
        System.out.println("=============================================");


        System.out.println(yellowPen == bluePen);
        System.out.println(Integer.toHexString(bluePen.hashCode()));
        System.out.println(Integer.toHexString(yellowPen.hashCode()));


        System.out.println("=============================================");

        // 만약에 펜의 시리얼 넘버가 같다면 같은 펜으로 취급하겠다.
        Pen pen1 = new Pen(150L, "빨강", 1000, company);
        Pen pen2 = new Pen(150L, "빨강", 1500, company);
        System.out.println(pen1.equals(pen2));

        System.out.println("pen2 = " + pen2.hashCode());
        System.out.println("pen1 = " + pen1.hashCode());


    }
}
