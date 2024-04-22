package day10.exception;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

//        ThrowsExample te = new ThrowsExample();
//        int n = te.inputNumber();
//        System.out.println("n = " + n);
//        try {
//            int n = te.convert("100!@");
//            System.out.println("n = " + n * 20);
//        } catch (NumberFormatException e) {
//            System.out.println("정수로 이루어진 문자열이 아니오");
//        }
        try {
            LoginUser user = new LoginUser("abc1234", "1234");
            user.loginValidate("abc134", "1234");
        } catch (InvalidLoginInputException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
