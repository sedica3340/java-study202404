package day10.inter.animal;

public interface Pet {

    // 애완 동물이라면 반드시 가져야 할 기능을 명세
    void handle(); // 애완동물은 다룰 수 있어야 함
    boolean inject(); // 애완동물은 예방접종을 했어야 함


}
