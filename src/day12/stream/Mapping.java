package day12.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

    public static void main(String[] args) {
        List<Integer> calories = Menu.menuList.stream().map(dish -> {
            return dish.getCalories();
        }).collect(Collectors.toList());
        System.out.println("calories = " + calories);

        Menu
                .menuList
                .stream()
                .map(dish -> dish.isVegeterian())
                .collect(Collectors.toList())
                .forEach(b -> System.out.println(b));
        Menu
                .menuList
                .stream()
                .map(dish -> dish.getType())
                .collect(Collectors.toList())
                .forEach(t -> System.out.println(t));
        Menu
                .menuList
                .stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList())
                .forEach(n -> System.out.println(n));

        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );
        List<Integer> collected = words
                .stream()
                .map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println(collected);

        List<Character> collect = words
                .stream()
                .map(w -> w.charAt(0))
                .collect(Collectors.toList());
        System.out.println(collect);

        // 메뉴 목록에서 메뉴이름과 칼로리를 추출해서 새로운 객체에 포장하고 싶음

        List<nameCalories> nameCaloriesList = Menu
                .menuList
                .stream()
                .map(dish -> new nameCalories(dish))
                .collect(Collectors.toList());

        nameCaloriesList.forEach(nc -> System.out.println(nc));
    }
    public static class nameCalories {
        private final String name;
        private final int calories;

        public nameCalories(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public nameCalories(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }
    }
}
