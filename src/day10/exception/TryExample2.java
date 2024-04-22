package day10.exception;

import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1;
        for (; true; ) {
            System.out.print("정수1: ");
            try {
                n1 = Integer.parseInt(sc.next());
                break;
            } catch (Exception e) {
                System.out.println(e);
//                e.printStackTrace();// 에러 로그를 띄움
            }
        }
        double n2;
        for (; true; ) {
            System.out.print("정수2: ");
            try {
                n2 = Integer.parseInt(sc.next());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        try {
            double result = n1 / n2;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("알 수 없는 에러입니다.");
        }



    }
}
