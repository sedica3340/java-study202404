package day11.api.lang;

public class SystemExample {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "abc";
        }

        long end = System.currentTimeMillis();

        long time = end - start;
        System.out.println("time = " + time);
    }
}
