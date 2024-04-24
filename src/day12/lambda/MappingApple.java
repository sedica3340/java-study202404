package day12.lambda;

import java.util.ArrayList;
import java.util.List;

// 사과중에 원하는 데이터만 추출해서 새로운 리스트로 매핑
public class MappingApple {
    public static <X, Y> List<Y> map(List<X> list, GenericFunction<X, Y> f) {
        List<Y> mappedList = new ArrayList<>();
        // 반복문과 조건문으로 필터링
        for (X x : list) {
            mappedList.add(f.apply(x));
        }

        return mappedList;
    }
}
