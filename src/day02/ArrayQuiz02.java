package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nickList = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("우리반 학생들의 별명: " + Arrays.toString(nickList));
        outer:
        for (; true; ) {
            System.out.println("삭제할 학생의 별명을 입력해주세요 \"그만\"을 입력하면 멈춥니다.");
            System.out.print(">");
            String nick = scan.nextLine();
            if(nick.equals("그만")) {
                System.out.println("최종 정보: " + Arrays.toString(nickList));
                break;
            }
            for (int i = 0; i < nickList.length; i++) {
                if (nick.equals(nickList[i])) {
                    System.out.println(nickList[i] + "의 별명을 삭제합니다.");
                    for (int j = i; j < nickList.length - 1; j++) {
                        nickList[j] = nickList[j + 1];
                    }
                    String[] temp = new String[nickList.length - 1];
                    for (int j = 0; j < temp.length; j++) {
                        temp[j] = nickList[j];
                    }
                    nickList = temp;
                    temp = null;
                    System.out.println("* 삭제 후 정보:" + Arrays.toString(nickList));
                    continue outer;
                }
            }
            System.out.println(nick + "은 존재하지 않는 별명입니다.");
        }
    }
}
//