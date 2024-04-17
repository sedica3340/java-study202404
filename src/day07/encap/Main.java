package day07.encap;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("carnival");

        myCar.startStop();

        myCar.setSpeed(80);
        System.out.println("현재속도: " + myCar.getSpeed() + "km/h");

        // 변속 모드
        myCar.setMode('X');
        System.out.println("현재 변속 모드: " + myCar.getMode());
    }
}
