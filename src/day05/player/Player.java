package day05.player;

public class Player {

//    필드
    String nickName;
    int level;
    int hp;
    int defence;
    int offence;
    int backDamage;

//    생성자는 생성자 내부에서 또다른 생성자를 호출할 수 있다.

    public Player() {
        this("익명");
        System.out.println("익명유저 생성");
    }

    public Player(String nickName) {
        this(nickName,1);
        System.out.printf("일반유저 생성 이름: %s\n", this.nickName);
    }

    public Player(String nickName, int level) {
        this.nickName = nickName;
        this.level = level;
        this.hp = 999;
        this.defence = 1;
        this.offence = 10;
        this.backDamage = 3;
        System.out.printf("유료결제유저 생성 이름: %s\n", this.nickName);
    }

    //    메서드
    void attack(Player target) {
        target.hp -= this.offence - target.defence;
        this.hp -= target.backDamage - this.defence;

        System.out.printf("%s님이 %s님을 공격했습니다.\n", this.nickName, target.nickName);
        System.out.printf("%d의 데미지를 입히고 %d의 반사데미지를 입었습니다.\n", this.offence - target.defence, target.backDamage - this.defence);
        System.out.printf("%s님의 남은 체력:%d\n", this.nickName, this.hp);
        System.out.printf("%s님의 남은 체력:%d\n", target.nickName, target.hp);
    }
}
