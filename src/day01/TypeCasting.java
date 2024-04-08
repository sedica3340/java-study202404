package day01;

public class TypeCasting {
    public static void main(String[] args) {

        byte a = 100;   // 1byte
        // 암묵적 형 변환
        int b = a;      // 4byte

        System.out.println("b = " + b);
        //1000 => 0 0000000 00000000 00000011 11101000 => c
        int c = 1000;   //4byte
        // 명시적 형 변환
        // d: 1 1101000
        // 0010111
        // -> 1의 보수 : + 1
        // 00000001
        // 0011000 => 16 + 8 = 24
        // 음수로 변환 -> -24
        byte d = (byte)c;     //1byte
        System.out.println("d = " + d);

        int k = 50;     // 4byte
        double j = k;   // 8byte
        System.out.println("j = " + j);
        double m = 5.567;
        int n = (int)m;
        System.out.println("n = " + n);

        // 암묵적 형 변환 -> upcasting (promotion)
        // 명시적 형 변환 -> downcasting
        // -> 데이터 손실을 일으킬 수 있음.

        int v = 100;
        double z = 5.5;
        // 타입이 다른 데이터의 연산은 작은 쪽을 큰쪽으로 캐스팅한다.
        double result = v + z;

        float f1 = 3.14F;
        double f2 = 5.5;
        double v1 = f1 - f2;

        char cc = 'A';
        int plusNum = 3;
        char r4 = (char) (cc+ plusNum);
        System.out.println("r4 = " + r4);
    }
}
