package day06.member;

// 역할: 회원 배열을 관리하는 끄라스 - 회원 데이터 저장소
public class MemberRepository {
    static Member[] members; // 현재 관리되는 회원들
    static Member[] restoreList;

    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("abc@def.com", "1234", "콩순이", "여성", 50);
        members[1] = new Member("qwe@def.com", "2345", "팥돌이", "남성", 40);
        members[2] = new Member("zxc@def.com", "3456", "밤순이", "여성", 30);
        this.restoreList = new Member[0];
    }
    // 메서드
    // 회원정보 생성
    // 주는 그대로 받아서 만들기만하는놈

    /**
     * 생성된 회원정보를 회원 배열의 끝에 추가하는 기능
     *
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    void addNewMember(Member newMember) {

        // 배열에 데이터를 추가하는 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }

    /**
     * 이메일 중복여부를 확인하는 기능
     *
     * @param targetEmail - 검사할 사용자의 입력 이메일값
     * @return - 이메일이 중복된다면 true
     * 사용가능 하다면 false
     * @author - 나
     * @since 2024.04.16
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : members) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

    int getIndex(String targetEmail) {
        for (int i = 0; i < members.length; i++) {
            if (targetEmail.equals(members[i].email)) return i;
        }
        return -1;
    }

    void changePW(int index, String newPW) {
        members[index].password = newPW;
    }

    void changeName(int index, String newName) {
        members[index].memberName = newName;
    }

    void tranceGender(int index, String newGender) {
        members[index].gender = newGender;
    }

    void remove(int index) {
        Member[] temp = new Member[members.length - 1];
        Member[] temp2 = new Member[restoreList.length + 1];
        for (int i = 0; i < members.length; i++) {
            if (i < index) {
                temp[i] = members[i];
            } else if (i > index) {
                temp[i - 1] = members[i];
            } else {
                temp2[temp2.length - 1] = members[i];
            }
        }
        members = temp;
        restoreList = temp2;
    }

    boolean restoreMember(String targetEmail) {
        int i = 0;
        for (Member m : restoreList) {
            if (targetEmail.equals(m.email)) {
                addNewMember(m);
                Member[] temp = new Member[restoreList.length - 1];
                if (temp.length != 0) {
                    for (int j = 0; j < restoreList.length; j++) {
                        if (j < i) {
                            temp[j] = restoreList[j];
                        } else if (j > i) {
                            temp[j - 1] = restoreList[j];
                        }
                    }
                }
                restoreList = temp;
                return true;
            }
            i++;
        }
        return false;
    }
}