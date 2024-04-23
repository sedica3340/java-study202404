package day11.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        // 중복저장 허용 x, 순서가 없음, 비교적 빠른 저장속도
        Set<String> set = new HashSet<>();

        boolean flag1 = set.add("김말이"); // true
        set.add("김꼬치");
        set.add("단김지");
        boolean flag2 = set.add("김말이"); // false
        set.add("김밥김");

        System.out.println("set = " + set);
        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);

        System.out.println(set.size());

        // 탐색시에 개별탐색은 불가능 index가 없으므로
        for (String s : set) {
            System.out.println("s = " + s);
        }
        set.remove("단김지");

        List<Integer> numbers = List.of(3,3,3,3,3,3,3,1,1,1,1,1,1,1,1,5,5,5,5,5,5,5,5,5,7,7,7,7,7,7);

        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

        numbers = new ArrayList<>(numberSet);
        System.out.println("numbers = " + numbers);
    }
}
