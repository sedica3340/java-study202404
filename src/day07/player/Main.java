package day07.player;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("주차왕파킹");
        Mage m = new Mage("저금왕뱅킹");
        Hunter h = new Hunter("상상왕씽킹");

        w.showStatus();
        m.showStatus();
        h.showStatus();

    }
}
