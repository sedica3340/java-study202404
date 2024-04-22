package day10.inter;

public interface SmartPhone {

    // 인터페이스는 처음부터 객체를 만들지 않을 것을 가정했으므로
    // 생성자 및 필드르 선언할 수 없음. 다만 상수는 선언 가능

    int age = 10;


    // 스펙 보여주기 기능
    void information();
    // 충전하는 기능
    void charge();
    // 카메라 기능
    void camera();
    // ...

}
