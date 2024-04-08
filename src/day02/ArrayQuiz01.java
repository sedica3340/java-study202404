package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {

        String[] temp = new String[100];
        Scanner scan = new Scanner(System.in);

//        String userName = scan.nextLine();
        System.out.println("# 먹고싶은 음식을 입력하세요!!\n#입력을 중지하려면 \"그만\"을 입력하세요.");
        for (int i = 0; true; i++) {
            System.out.print(">>");
            String food = scan.nextLine();
            if (food.equals("그만")) {
                String[] foodList = new String[i];
                for (int j = 0; j < i; j++) {
                    foodList[j] = temp[j];
                }
                temp = null;
                System.out.println("먹고싶은 음식 리스트: " + Arrays.toString(foodList));
                break;
            }
            temp[i] = food;


        }
    }
}
