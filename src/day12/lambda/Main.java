package day12.lambda;


import day07.modi.pac1.A;

import java.util.List;

import static day12.lambda.Color.*;
import static day12.lambda.Color.YELLOW;
import static day12.lambda.FilterApple.filter;
import static day12.lambda.FilterApple.filterApples;
import static day12.lambda.MappingApple.map;

class AppleColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor() == GREEN || apple.getColor() == RED;
    }
}

public class Main {

    public static void main(String[] args) {


        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        List<Apple> greenApples = FilterApple.filterApplesByColor(appleBasket, GREEN);
        System.out.println("greenApples = " + greenApples);

        List<Apple> redApples = FilterApple.filterApplesByColor(appleBasket, RED);
        System.out.println("redApples = " + redApples);
        System.out.println("--=-=-=--=-=---=-==--=-=-=-=-");


        List<Apple> apples1 = filterApples(appleBasket, new AppleWeightPredicate());
        System.out.println("apples1 = " + apples1);
        System.out.println("==========================");

        List<Apple> apples2 = filterApples(appleBasket, new AppleColorPredicate());
        System.out.println("apples2 = " + apples2);
        System.out.println("==============================");

        List<Apple> apples3 = filterApples(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED && apple.getWeight() >= 100;
            }
        });
        System.out.println("apples3 = " + apples3);
        System.out.println("============================");

        List<Apple> apples4 = filterApples(appleBasket, apple -> apple.getColor() == YELLOW && apple.getWeight() <= 80);
        System.out.println("apples4 = " + apples4);


        List<Apple> apples5 = filter(appleBasket, apple -> apple.getColor() == YELLOW);
        System.out.println("apples5 = " + apples5);

        List<Color> colors1 = map(appleBasket, apple -> apple.getColor());
        System.out.println("colors1 = " + colors1);

        List<Integer> weights = map(appleBasket, apple -> apple.getWeight());
        System.out.println("weights = " + weights);
    }
}
