package day12.lambda;

// 사과를 여러가지 방법으로 필터링 하는 클래스

import java.util.ArrayList;
import java.util.List;

public class FilterApple {


    /**
     *
     * @param basket : 다양한 사과가 들어있는 리스트
     * @return - basket에서 녹색 사과만 필터링한 리스트
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {

        List<Apple> filteredApples = new ArrayList<>();
        // 반복문과 조건문으로 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == color) {
                filteredApples.add(apple);
            }

        }


        return filteredApples;
    }
    public static List<Apple> filterApplesByWeight(List<Apple> basket, int weight) {
        return null;
    }

}
