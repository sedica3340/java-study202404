package day05.player;

public class Main {

    public static void main(String[] args) {

        Player black = new Player("Neltharion");
        Player red = new Player("Alexstrasza");
        Player anan = new Player();
        black.attack(red);
        black.attack(red);
//        System.out.println("black.hp = " + black.hp);
//        System.out.println("red.hp = " + red.hp);
    }
}
