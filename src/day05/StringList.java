package day05;

import java.util.Arrays;

// 스트링 배열을 관리하는 객체의 설계도
public class StringList {
    String[] sArr;

    //        생성자를 통해 스트링 배열을 초기화 한다
    StringList() {
        sArr = new String[0];
    }
    StringList(String ...el) {
//        sArr = new String[el.length];
//        for (int i = 0; i < el.length; i++) {
//            sArr[i] = el[i];
//        }
        sArr = el;
    }

    public String toString() {
        return Arrays.toString(sArr);
    }

    public int size() {
        return sArr.length;
    }

    public void push(String el) {
        String[] temp = new String[sArr.length + 1];
        System.arraycopy(sArr, 0, temp, 0, sArr.length);
        temp[temp.length - 1] = el;
        sArr = temp;
    }
//
    public void pop() {
        String[] temp = new String[sArr.length - 1];
        System.arraycopy(sArr, 0, temp, 0, temp.length);
        sArr = temp;
    }
//

// 인덱스 탐색 (indexOf)
public int indexOf(String target) {
    for (int i = 0; i < sArr.length; i++) {
        if (target.equals(sArr[i])) {
            return i;
        }
    }
    return -1;
}

    // 자료 유무 확인 (includes)
    public boolean includes(String target) {
        return indexOf(target) != -1;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    public String remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return targetData;
    }
    // 중간 삭제 (remove) : 값으로 삭제
    public String remove(String target) {
        return remove(indexOf(target));
    }

    // 중간 삽입 (insert)
    public void insert(int index, String newData) {

        if (index < 0 || index > sArr.length) return;
        if (index == sArr.length) {
            push(newData);
            return;
        }
        String[] temp = new String[sArr.length + 1];
        System.arraycopy(sArr, 0, temp, 0, sArr.length);
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }

    public void set(int index, String el) {
        sArr[index] = el;
    }

    public void clear() {
        sArr = new String[0];
    }

    public boolean isEmpty() {
        return sArr.length == 0;
    }
}
