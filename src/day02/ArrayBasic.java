package day02;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // 배열의 특징
        // 1. 동종 모음 구조 : 같은 타입의 데이터만 배열에 담을 수 있음
        // 2. 크기가 불변함: 크기를 동적으로 늘이거나 줄일 수 없음

        // 배열의 생성 순서

        // 1. 배열 변수 선언
        int[] numbers;
        // 2. 배열의 객체를 생성
        numbers = new int[5];
        System.out.println("numbers = " + numbers);
        // 3. 배열 값 초기화
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int)66.7;
        numbers[3] = numbers[0] + 20;
        numbers[4] = 100;
//        numbers[5] = 1001;
        System.out.println(numbers.length);

        // 배열의 순회
        System.out.println("============");
        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }

        System.out.println("==================");

        // 배열 순회 foreach: 단축키 iter
        for (int n : numbers) {
            System.out.println("n = " + n);
        }

        // 배열 내부 간결하게 출력
        System.out.println(Arrays.toString(numbers));

        //배열 한번에 만들기
        int[] pointList = new int[] {10, 20, 30, 40};
        System.out.println(Arrays.toString(pointList));

        // 만약 배열변수 선언과 동시에 값을 초기화 한다면
        // new type[] 생략 가능
        String[] pets = {"멍멍이", "잭잭이", "콩국수"};
        pets = new String[] {"zzz", "fff"};

        //배열을 생성만하고 값을 안넣으면?
        //각 타입의 기본값으로 미리 값을 넣어놓음
        //기본값: 정수 0, 실수0.0, 논리 false, char ' ', 기타 null
        byte[] bArr = new byte[3];
        System.out.println(Arrays.toString(bArr));
        System.out.println(bArr.length);

        double[] dArr = new double[6];
        System.out.println(Arrays.toString(dArr));

        boolean[] blArr = new boolean[4];
        System.out.println(Arrays.toString(blArr));

        String[] sArr = new String[2];
        System.out.println(Arrays.toString(sArr));
    }
}
