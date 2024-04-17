package day07.player;

// 하위 클래스 (sub class)
// : 상위 클래스로부터 공통 필드와 메서드를 이어받음.
public class Warrior extends Player {

    int rage;

    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }

    public void dash(Player target) {
        System.out.printf("dash 스킬을 사용합니다.");
    }
}
