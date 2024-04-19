package util;

import java.util.Scanner;

//역할: 스캐너 입력을 간소화 해주는 객체
public class SimpleInput {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }
    //문자열 입력을 처리
    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
    public static void stop() {
        System.out.println("\n계속하시려면 엔터");
        sc.nextLine();
    }
}
