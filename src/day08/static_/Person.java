package day08.static_;

public class Person {

    String name;
    int age;
    static String nation;

    // 정적 초기화자 (static initializer)
    // static 필드의 생성자 같은 역할 (static 필드 초기화 담당)
    static {
        nation = "korea";

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
