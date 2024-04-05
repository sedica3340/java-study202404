package day01;

public class Variable {
    static int n4 = 13;

    public static void main(String[] args) {

        int score = 78;
        String userName = "홍길동";

        //        변수의 스코프 - 블록레벨 스코프
        // 자바의 변수는 생성된 블록이 종료되면 메모리에서 사라짐
        int i = 100;
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        } //end for

        int n1 = 10;
        int n2;
        if (true) {
            System.out.println(n1);
            n2 = 11;
            while (true) {
                System.out.println(n2);
                int n3 = 12;
                break;
            }
            System.out.println(n2);
        }//end if
        System.out.println(n1);
    }//end main

    int n5 = n4;
}//ent class
