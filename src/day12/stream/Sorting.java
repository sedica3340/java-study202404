package day12.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기

        List<Dish> lowCalMeat = Menu
                .menuList
                .stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());
        System.out.println(lowCalMeat);

        // 메뉴 목록에서 메뉴들을 이름 내림차로 정렬 (zyx...)

        Menu
                .menuList
                .stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 칼로리가 300 칼로리보다 큰 요리 중
        // 칼로리가 낮은순으로 앞에서 3개만 필터링
        System.out.println("====================");
        Menu
                .menuList
                .stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .filter(dish -> dish.getCalories() >= 300)
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
