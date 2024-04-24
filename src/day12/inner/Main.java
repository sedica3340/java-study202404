package day12.inner;


public class Main {
    //    내부 클래스 ( 중첩 클래스 )
    // 뺄셈 계산기가 필요한데 아마도 이 계산기 설계도는 메인클래스 안에서만 사용하고
    // 외부에서는 사용하지 않을 것 같다
    public static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return Math.abs(n1 - n2);
        }
    }

    public static void main(String[] args) {

        Calculator cal;

        cal = new AddCalculator();

        int r1 = cal.operate(10, 20);
        System.out.println("r1 = " + r1);

        cal = new SubCalculator();

        int r2 = cal.operate(25, 40);
        System.out.println("r2 = " + r2);

        // 익명 클래스: 이름이 없는 클래스를 빠르게 선언하는 법
        // 클래스를 통해 객체를 생성하긴 할건데 재활용은 안할 것 같다
        cal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        int r3 = cal.operate(4,8);
        System.out.println("r3 = " + r3);
        // 람다
        // 사용 전제조건
        // 반드시 인터페이스 내부의 추상메서드가 한개 이하여야함
        cal = (n1, n2) -> n1 / n2;
        int r4 = cal.operate(20,5);
        System.out.println("r4 = " + r4);

        System.out.println("=================================");

        Restaurant fr = new FrenchRestaurant();
        Restaurant fr2 = new FrenchRestaurant();
        Restaurant fr3 = new FrenchRestaurant();

        Restaurant jr = new Restaurant() {
            @Override
            public void cook() {
                System.out.println("일본 요리를 합니다.");
            }

            @Override
            public void reserve() {
                System.out.println("일식점 예약을 합니다.");
            }
        };
        fr.cook();
        jr.cook();

        Restaurant italian = new Restaurant() {
            @Override
            public void cook() {
                System.out.println("이탈리아 요리를 합니다.");
            }

            @Override
            public void reserve() {
                System.out.println("이태리음식점 예약을 합니다.");

            }
        };
        italian.cook();
    }

}
