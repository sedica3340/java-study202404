package day06.member;

import java.time.LocalDate;

public class Member {

    int id;
    String email;
    String memberName;
    String password;
    String gender;
    int age ;
    LocalDate regDate;

    Member(String email, String password, String memberName, String gender, int age) {
        this.id = 1;
        this.regDate = LocalDate.now();

        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return String.format("# 이름: %s, 이메일: %s, 나이: %d세, 성별: %s 가입일: %s, pw: %s"
        , this.memberName, this.email, this. age, this.gender, this.regDate, this.password);

    }
}
