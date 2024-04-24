package day12.inner;

public class FrenchRestaurant implements Restaurant{
    @Override
    public void cook() {
        System.out.println("프랑스 요리를 합니다.");
    }

    @Override
    public void reserve() {
        System.out.println("프랑스 레스토랑을 예약합니다.");
    }
}
