package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01_2 {

    public static void main(String[] args) {

        String[] foodList = {};
        Scanner scan = new Scanner(System.in);

//        String userName = scan.nextLine();
        System.out.println("# 먹고싶은 음식을 입력하세요!!\n#입력을 중지하려면 \"그만\"을 입력하세요.");
        for (int i = 0; true; i++) {
            String[] temp = new String[i + 1];
            for (int j = 0; j < foodList.length; j++) {
                temp[j] = foodList[j];
            }
            System.out.print(">>");
            String food = scan.nextLine();
            if (food.equals("그만")) {
                temp = null;
                System.out.println("먹고싶은 음식 리스트: " + Arrays.toString(foodList));
                break;
            }
            temp[i] = food;
            foodList = temp;


        }
    }
}
