package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inputName = scan.nextLine();

        String myName = new String("홍길동");
        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

/*
        char[] nickName = {'&#xCD95;','&#xAD6C;','&#xAC10;','&#xC790;'};
        String nick = new String(nickName);
        System.out.println(nick);
*/

        System.out.println(myName.equals(inputName) ? "두 문자열이 같다" : "두 문자열이 다르다");
    }
}