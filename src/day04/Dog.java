package day04;

public class Dog {
    String name;
    int age;
    boolean injection;

    void petInfo() {
        System.out.printf("우리집 강아지는 %s이며 %d살입니다.\n", name, age);
        System.out.println(injection ? "예방접종을 했어요" : "아직 예방접종을 안했어요");
    }
    void inject() {
        System.out.printf("%s 강아지에게 주사를 맞햐요!\n", name);
        injection = true;
    }
    Dog() {
        System.out.println("1번 생성자 호출");
    }
    //생성자
    Dog(String dName) {
        System.out.println("2번 생성자 호출");
        name = dName;
        age = 1;
    }
}
