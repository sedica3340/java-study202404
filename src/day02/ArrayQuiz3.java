package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("변경 전 정보: " + Arrays.toString(tvxq));
        outer:
        for (; true; ) {
            System.out.println("-수정할 멤버의 이름을 입력하세요.");
            System.out.print(">>");
            String member = scan.nextLine();
            for (int i = 0; i < tvxq.length; i++) {
                if (member.equals(tvxq[i])) {
                    System.out.println(tvxq[i] + "의 별명을 변경합니다.");
                    System.out.print(">>");
                    String nick = scan.nextLine();
                    tvxq[i] = nick;
                    System.out.println("변경완료\n * 변경 후 정보:" + Arrays.toString(tvxq));
                    break outer;
                }
            }
            System.out.println(member + "은(는) 존재하지 않는 멤버입니다.");
        }
    }
}
