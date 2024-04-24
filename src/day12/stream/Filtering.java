package day12.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) {

        List<Dish> veget = Menu.menuList.stream().filter(dish -> dish.isVegeterian()).collect(Collectors.toList());
        System.out.println("veget = " + veget);

        veget.forEach(dish -> {
            System.out.println("dish.getName() = " + dish.getName());
        });

        System.out.println("==================");

        List<Dish> meat600List = Menu.menuList.stream().filter(dish -> {
            return dish.getType() == Dish.Type.MEAT && dish.getCalories() >= 600;
        }).collect(Collectors.toList());

        System.out.println("meat600List = " + meat600List);

        List<Dish> fourLength = Menu.menuList.stream().filter(dish -> {
            return dish.getName().length() == 4;
        }).collect(Collectors.toList());
        System.out.println("fourLength = " + fourLength);

        Menu
                .menuList
                .stream()
                .filter(dish -> dish.getCalories() >= 300)
                .limit(3)// 앞에 3개만 수집하기
                .collect(Collectors.toList());

        Menu
                .menuList
                .stream()
                .filter(dish -> dish.getCalories() >= 300)
                .skip(2) // 앞에 두개는 건너뛰고 수집하기
                .collect(Collectors.toList());

        List<Integer> numbers = List.of(1,2,3,1,4,1,2,3,1,4,1,5,1,2,1);
        List<Integer> evenNumbers = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .distinct() // 중복 제거
                .collect(Collectors.toList());
        System.out.println("evenNumbers = " + evenNumbers);
    }
}
