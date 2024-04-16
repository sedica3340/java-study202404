package day06.member;

public class Test {

    public static void main(String[] args) {

        Member[] arr = new Member[5];

        Member m1 = new Member("abc@def.com", "1234", "김철수", "남성", 30);

        Member m2 = new Member("xyz@ghi.com", "4567", "김영희", "여성", 31);

        arr[0] = m1;
        arr[1] = m2;
        arr[2] = new Member("a", "a", "a", "a", 1);

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("=============================");
        MemberRepository mr = new MemberRepository();
        MemberView mv = new MemberView();

        Member newMember = new Member("ddd@fff.com", "4321", "찰떡이", "남성", 13);

        mr.addNewMember(newMember);

        mv.showMembers();


    }
}
