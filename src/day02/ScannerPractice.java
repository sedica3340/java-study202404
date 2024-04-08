package day02;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("상품의 가격: ");
        int price = Integer.parseInt(scan.nextLine());
        System.out.print("상품의 수량: ");
        int amount = Integer.parseInt(scan.nextLine());
        int totalprice= price * amount;
        System.out.println("가격: " + price + ", 수량: " + amount);
        System.out.println("총액:  " +totalprice);

    }
}
