package day06.member;

// 역할: 회원 데이터 관리를 위해 입력 출력을 담당
public class MemberView {

    //객체의 협력
    MemberRepository mr;

    MemberView() {
        this.mr = new MemberRepository();
    }


    void showMembers() {
        System.out.printf("==============현재 회원 목록 (총 %d명)================\n", this.mr.members.length);
        for (Member m : this.mr.members) {
            System.out.println(m);

        }
    }
}
