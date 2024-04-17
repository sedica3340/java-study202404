package day07.encap.practice;

import java.time.LocalDate;

import static java.lang.Integer.parseInt;

public class Car {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (LocalDate.now().getYear() >= year) {
            this.year = year;
        }
    }
}
//        // Car 클래스 테스트
//        Car myCar = new Car();
//        myCar.setBrand("현대");
//        myCar.setModel("그랜져");
//        myCar.setYear(2020);
//        System.out.println("Car Brand: " + myCar.getBrand());
//        System.out.println("Car Model: " + myCar.getModel());
//        System.out.println("Car Year: " + myCar.getYear());
// = LocalDate.now();