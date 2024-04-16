package day06.member;

// 역할: 회원 배열을 관리하는 끄라스 - 회원 데이터 저장소
public class MemberRepository {
    static Member[] members;

    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("adc@def.com", "1234", "콩순이", "여성", 50);
        members[1] = new Member("qwe@def.com", "2345", "팥돌이", "남성", 40);
        members[2] = new Member("zxc@def.com", "3456", "밤순이", "여성", 30);
    }
    // 메서드
    // 회원정보 생성
    // 주는 그대로 받아서 만들기만하는놈
    void addNewMember(Member newMember) {
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }


}
