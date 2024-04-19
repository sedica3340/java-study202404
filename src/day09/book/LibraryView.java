package day09.book;

import static util.SimpleInput.input;

public class LibraryView {

    private static LibraryRepository repository;

    static {
        repository = new LibraryRepository();
    }

    public static void login() {
        System.out.println("# 회원정보를 입력해 주세요.");
        String name = input("# 이름: ");
        int age = Integer.parseInt(input("# 나이: "));
        String gender = input("# 성별(M/F): ");

    }

}
