package day08.final_;

class Child extends Parent {

//    @Override
//    void sing() {
//        System.out.println("비비의 밤양갱");
//    }
//
//    @Override
//    void dance() {
//        System.out.println("춤을 핑팡퐁");
//    }
}

public class Parent {

    final void sing() {
        System.out.println("노래를 랄랄라");
    }
    final void dance() {
        System.out.println("댄스를 하하호호");
    }

}
