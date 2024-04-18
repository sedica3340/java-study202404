package day06.member;

import util.SimpleInput;

// 역할: 회원 데이터 관리를 위해 입력 출력을 담당
public class MemberView {

    //객체의 협력
    MemberRepository mr;
    SimpleInput si;

    MemberView() {
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
    }


    void showMembers() {
        System.out.printf("==============현재 회원 목록 (총 %d명)================\n", this.mr.members.length);
        for (Member m : this.mr.members) {
            System.out.println(m);
        }
    }

    // 회원정보 생성을 위해 입력을 처리

    void inputNewMember() {

        String email = null;
        for (; true; ) {
            email = si.input("- 이메일: ");
            if (!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일입니다.");
        }
        String name = si.input("- 이름: ");
        String password = si.input("- 패스워드: ");
        String gender = si.input("- 성별(M/F): ");
        if(gender.equals("M")) {
            gender = MemberConstants.MALE;
        } else if (gender.equals("F")) {
            gender = MemberConstants.FEMALE;
        }
        int age = Integer.parseInt(si.input("- 나이: "));

        // 입력데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);

        // 위임 - 관심사의 분리
        mr.addNewMember(newMember);
    }

    // 사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        if (mr.members.length != 0) {
            System.out.println("* 2. 개별회원 정보 조회하기");
            System.out.println("* 3. 전체회원 정보 조회하기");
            System.out.println("* 4. 회원 정보 수정하기");
            System.out.println("* 5. 회원 정보 삭제하기");
        } else {
            System.out.println("2~5. 현재 회원이 없습니다.");
        }
        if (mr.restoreList.length != 0) {
            System.out.println("* 6. 회원 정보 복구하기");
        } else {
            System.out.println("* 6. 복구할 회원 없음");
        }
        System.out.println("* 7. 프로그램 종료");
        System.out.println("======================");

        return si.input("- 메뉴 번호: ");
    }

    boolean exitProgram() {
        String exit = si.input("프로그램을 종료합니까? [y/n]\n>> ");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다.");
            return true;
        } else {
            System.out.println("프로그램 종료를 취소합니다.");
            return false;
        }
    }

    void showMember() {
        for (; true; ) {
            String targetEmail = si.input("이메일: ");
            int index = mr.getIndex(targetEmail);
            if (index >= 0) {
                System.out.println(mr.members[index]);
                System.out.println("======= 조회 결과 =======");
                System.out.printf("이름: %s\n비밀번호: %s\n성별: %s\n나이: %d"
                        , mr.members[index].memberName, mr.members[index].password, mr.members[index].gender, mr.members[index].age);
                break;
            } else {
                System.out.println("# 조회된 회원이 없습니다.");
            }
        }
    }

    void change() {
        for (; true; ) {
            String targetEmail = si.input("수정할 대상의 이메일: ");
            int index = mr.getIndex(targetEmail);
            if (index >= 0) {
                System.out.println("# 수정할 내용을 선택해주세요.");
                String changeNum = si.input("[1: 비밀번호, 2: 이름, 3: 성별]: ");
                switch (changeNum) {
                    case "1":
                        System.out.printf("%s님의 비밀번호를 변경합니다.\n", mr.members[index].memberName);
                        String newPW = si.input("#새로운 비밀번호: ");
                        mr.changePW(index, newPW);
                        System.out.println("비밀번호가 변경되었습니다.");
                        break;
                    case "2":
                        System.out.printf("%s님의 이름을 변경합니다.\n", mr.members[index].memberName);
                        String newName = si.input("#새로운 이름: ");
                        System.out.printf("%s님의 이름이 ", mr.members[index].memberName);
                        mr.changeName(index, newName);
                        System.out.printf("%s으로 변경되었습니다.", newName);
                        break;
                    case "3":
                        System.out.printf("%s님의 성별을 변경합니다.\n", mr.members[index].memberName);
                        String newGender = si.input("#새로운 성별: ");
                        mr.tranceGender(index, newGender);
                        System.out.printf("%s님의 성별이 %s으로 변경되었습니다.", mr.members[index].memberName, newGender);
                        break;
                }
                break;
            }
            System.out.println("# 존재하지 않는 이메일입니다.");
        }
    }

    void removeMember() {
        for (; true; ) {
            String targetEmail = si.input("# 삭제할 회원의 이메일: ");
            int index = mr.getIndex(targetEmail);
            if (index >= 0) {
                for (; true; ) {
                    String userAnswer = si.input("비밀번호: ");
                    if (!userAnswer.equals(mr.members[index].password)) {
                        System.out.println("비밀번호가 틀렸습니다.");
                    } else {
                        System.out.printf("# %s님의 정보를 삭제합니다.", mr.members[index].memberName);
                        mr.remove(index);
                        break;
                    }
                }
                break;

            } else {
                System.out.println("존재하지 않는 이메일입니다.");
            }
        }
    }

    void restore() {
        outer: for (; true; ) {
            String targetEmail = si.input("# 복구할 회원의 이메일: ");
            for (Member m : mr.restoreList) {
                if (!targetEmail.equals(m.email)) {
                    System.out.println("존재하지 않는 회원입니다.");
                } else {
                    for (; true; ) {
                        String userAnswer = si.input("비밀번호: ");
                        if (userAnswer.equals(m.password)) {
                            mr.restoreMember(targetEmail);
                            System.out.printf("%s님의 정보가 복구되었습니다.", mr.members[mr.members.length - 1].memberName);
                            break outer;
                        } else {
                            System.out.println("비밀번호가 틀렸습니다.");
                        }
                    }
                }
            }
//            if (!flag) System.out.println("존재하지 않는 회원입니다.");
//            else {
//                System.out.printf("%s님의 정보가 복구되었습니다.", mr.members[mr.members.length - 1].memberName);
//                break;

        }
    }

}
