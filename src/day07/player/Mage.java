package day07.player;

public class Mage extends Player{

    int mana;

    public Mage(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }


    public void thunderbolt(Player... targets) {

    }
}
