package day07.player;

public class Mage extends Player{

    int mana;

    public Mage(String nickname) {
        super(nickname);
        this.mana = 100;
    }


    public void thunderbolt(Player... targets) {
        System.out.printf("%s님 등 %d명이 썬더볼트를 맞았다\n", targets[0].nickname, targets.length);
        for (Player target : targets) {
            if(!this.equals(target)) {
                int damage = (int)(Math.random()* 6 + 10);
                target.hp -= damage;
                System.out.printf("%s님이 썬더볼트를 맞고 %d의 피해를 입었습니다. 남은체력: %d\n", target.nickname, damage, target.hp);
            }
        }
    }
}
