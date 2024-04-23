package day11.collection.map;

import day09.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        // 데이터 추가
        map.put("name", "박성진");
        map.put("age", 15);
        map.put("지갑잔액", 500);
        map.put("좋아하는 자동차", new Mustang());
        map.put("오늘 점심 메뉴", "분식");

        System.out.println(map);
        System.out.println(map.size());

        Map<String, Object> emp = new HashMap<>();
        emp.put("empName", "김철수");
        emp.put("empAge", 30);

        System.out.println(emp.get("empAge"));

        map.put("지갑잔액", 600);
        System.out.println(map);
        
        // map의 반복문 처리 for in 문과 비슷베슷
        for (String s : map.keySet()) {
            System.out.println("map.get(s) = " + map.get(s));
        }
    }
}
