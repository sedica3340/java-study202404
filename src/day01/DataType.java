package day01;

public class DataType {
    public static void main(String[] args) {


        // 1byte === 8bit
        // 1bit === 0이나 1을 저장할 수 있음
        // 맨앞의 첫 비트가 1이면 양수 0이면 음수 11111111 =>  64 + 32 + 16 + 8 + 4 + 2 + 1 === 127
        // 맨앞의 첫 비트가 1이면 양수 0이면 음수 01111111 =>  -(64 + 32 + 16 + 8 + 4 + 2 + 1) === -127
        byte a = 127;       //1byte => 8bit 안씀
        short b = 32767;    //2byte => 16bit ㅋㅋ안씀

        int c = 2147483647; //4byte => 32bit 2^31 - 1

        long d = 2147483648L;//8byte => 64bit
        System.out.println(d);
        float e = 3.14159212312312312312312312312312312F;   //  4byte 또 안씀.. 낭비삽가능
        double f = 3.14624523534235235235252352523235235235;//  8byte
        double g = 100;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println(g);


        boolean flag3 = a > b;
        //double v = Math.floor(Math.random() * 100) + 1;
        int i = 200;
        System.out.println(i + a);
        System.out.println(b * i);

        char text = 1300; // 2byte 0~65535;
        System.out.println("text = " + text);
        // 문자열 : 문자 배열
        char[] hello = {'안', '녕', '하', '세', '요'};
        System.out.println("hello = " + new String(hello));
        String hello2 = "안녕하세요";
    }
}
