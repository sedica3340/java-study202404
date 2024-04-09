package day03;

import java.util.Arrays;

public class MethodBasic {

    //자바의 함수는 반드시 클래스 블록 내부, 다른 함수 외부에 만들어야함

    // 두개의 정수를 전달받아 합을 리턴하는 함수

    static int add(int n1, int n2) {
//        return new String[]{"hello", "java"};
        return (n1 + n2);
    }

    static void multiply(int n1, int n2) {
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }

    //n개의 정수를 전달받아 그 총합을 반환하는 함수
    static int addall(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // 두개의 정수를 전달받아 사칙연산의 결과를 모두 리턴
    static double[] operate(double n1, double n2) {
        return new double[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {
        int r1 = add(123, 551);
        System.out.println("r1 = " + r1);

        //void 함수는 함수의 결과를 변수에 담을 수 없음
        //반드시 단독 호출해서 사용해야함
        multiply(5, 3);


        int r2 = addall(new int[]{10, 20, 50, 70, 1150, 35, 12, 4353543});
        System.out.println("r2 = " + r2);
        int r3 = addall(10, 50, 70);
        System.out.println("r3 = " + r3);


        double[] r4 = operate(6,8);
        System.out.println("r4 = " + Arrays.toString(r4));
    } //end main method

} //end class