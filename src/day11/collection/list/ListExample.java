package day11.collection.list;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {

        List<String> foods = new ArrayList<>();
        // 추가 .add(E)
        foods.add("짜장면");
        foods.add("볶음밥");
        foods.add("잠봉뵈르");
        foods.add("소금물");
        foods.add("파스타");
        System.out.println(foods);

        // 중간삽입 .add(index, E);
        foods.add(1, "짬뽕");
        System.out.println(foods);

        // length .size();
        int size = foods.size();
        System.out.println("size = " + size);

        System.out.println(foods.indexOf("잠봉뵈르"));

        System.out.println(foods.contains("파스타"));
        System.out.println(foods.contains("피에스타"));

        foods.remove(2);
        System.out.println(foods);

        foods.remove("짜장면");
        System.out.println(foods);

        foods.set(0,"동파육");
        System.out.println(foods);

        System.out.println(foods.get(1));

        // 반복문 처리
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i) + "JMT");
        }
        //
        System.out.println("==================");
        for (String food : foods) {
            System.out.println(food + "JMT");
        }

        foods.clear();
        System.out.println(foods);
        System.out.println(foods.isEmpty());

        // 리스트에 초기값 넣고 시작하기 (10, 20, 30)
        Integer[] arr = {10, -20, 30, 550, 12, 125};
//        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));
        List<Integer> numbers = new ArrayList<>(List.of(arr));
        System.out.println(numbers);

        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
    }
}
