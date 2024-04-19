package day09.book;

import static util.SimpleInput.input;

public class LibraryView {

    LibraryRepository lr = new LibraryRepository();
    private static LibraryRepository repository;

    static {
        repository = new LibraryRepository();
    }

    BookUser bu = new BookUser();

    public void inputName() {
        System.out.println("# 회원정보를 입력해 주세요.");
        String name = input("# 이름: ");
        bu.setName(name);
    }

    public void inputAge() {
        int age = Integer.parseInt(input("# 나이: "));
        bu.setAge(age);
    }

    public void inputGender() {
        Gender gen = null;
        for (; true; ) {
            String gender = input("# 성별(M/F): ");
            if (gender.equals("M") || gender.equals("m")) {
                gen = Gender.MALE;
                break;
            } else if (gender.equals("F") || gender.equals("f")) {
                gen = Gender.FEMALE;
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        bu.setGender(gen);
        bu.setCouponCount(0);
        LibraryRepository.setBookUser(bu);
    }

    public String menuOpen() {
        System.out.println("======= 도서 메뉴 =======");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 저자이름으로 검색");
        System.out.println("# 5. 도서 대여하기");
        System.out.println("# 6. 대여한 도서 목록");
        System.out.println("# 7. 도서 반납하기");
        System.out.println("# 8. 도서 기부하기");
        System.out.println("# 9. 프로그램 종료하기");
        return input("- 메뉴 번호 :");
    }

    public void myPage() {
        System.out.println("******* 회원님 정보 *******");
        System.out.printf("회원명: %s\n", repository.getBookUser().getName());
        System.out.printf("나이: %s\n", repository.getBookUser().getAge());
        System.out.printf("성별: %s\n", repository.getBookUser().getGenderToString());
        System.out.printf("쿠폰 개수: %s\n", repository.getBookUser().getCouponCount());
    }

    public void showBook(Book book) {
        if (book instanceof CookBook) {
            System.out.printf("# 분류: 요리책, 제목: %s, 쿠폰유무: %s\n", book.getTitle(), ((CookBook) book).isCoupon() ? "있음" : "없음");
        } else {
            System.out.printf("# 분류: 만화책, 제목: %s, 연령제한: %s세\n", book.getTitle(), ((CartoonBook) book).getAccessAge());
        }
    }

    public void showAllBook() {
        System.out.println("==== 모든 도서 정보 ====");
        for (Book book : LibraryRepository.getBookList()) {
            showBook(book);
        }
    }

    public void exit() {
        System.out.println("프로그램을 종료합니다");
    }

    public void searchForTitle() {
        System.out.println("제목으로 검색하기");
        String userInput = input("# 검색어: ");
        for (Book book : LibraryRepository.getBookList()) {
            if (book.getTitle().contains(userInput)) {
                showBook(book);
            }
        }
    }

    public void searchForAuthor() {
        System.out.println("저자 이름으로 검색하기");
        String userInput = input("# 검색어:");
        for (Book book : LibraryRepository.getBookList()) {
            if (book.getAuthor().contains(userInput)) {
                System.out.printf("저자: %s\n", book.getAuthor());
                showBook(book);
            }

        }
    }

    public void rentBook() {
        System.out.println("======= 도서 대여하기 =======");
        int i = 1;
        for (Book book : LibraryRepository.getBookList()) {
            System.out.print(i + ". ");
            showBook(book);
            i++;
        }
        int userInput = Integer.parseInt(input("대여할 책 번호: ")) - 1;

        Book targetBook = LibraryRepository.getBookList()[userInput];
        if (targetBook instanceof CookBook) {
            System.out.printf("성공적으로 요리책이 %s 대여 되었습니다.\n", ((CookBook) targetBook).isCoupon() ? "쿠폰 발급과 함께" : "");
            if (((CookBook) targetBook).isCoupon()) {
                LibraryRepository.getBookUser().setCouponCount(LibraryRepository.getBookUser().getCouponCount() + 1);
            }
            LibraryRepository.switchBook(userInput);
        } else {
            if (((CartoonBook) targetBook).getAccessAge() > LibraryRepository.getBookUser().getAge()) {
                System.out.println("도서 대여에 실패했습니다");
            } else {
                System.out.println("성공적으로 도서가 대여 되었습니다.");
                LibraryRepository.switchBook(userInput);
            }
        }
    }

    public void showAllRentList() {
        System.out.println("======= 대여한 책 =======");
        for (Book book : LibraryRepository.getRentList()) {
            showBook(book);
        }
    }

    public void getBackBook() {
        System.out.println("====== 도서 반납하기 ======");
        int i = 1;
        for (Book book : LibraryRepository.getRentList()) {
            System.out.print(i + ". ");
            showBook(book);
            i++;
        }
        int userInput = Integer.parseInt(input("반납할 책 번호: ")) - 1;
        LibraryRepository.giveBackBook(userInput);
        System.out.println("# 책이 성공적으로 반납되었습니다.");
    }

    public void donateBook() {
        System.out.println("====== 도서 기부하기 ======");
        String kind = input("1. 요리책\n2. 만화책\n(1, 2) :");
        String title = input("\n# 책 이름: ");
        String author = input("\n# 저자: ");
        String publisher = input("\n# 출판사: ");
        switch (kind) {
            case "1":
                lr.addBook(new CookBook(title, author, publisher, false));
                break;
            case "2":
                int accAge = Integer.parseInt(input("# 연령제한: "));
                lr.addBook(new CartoonBook(title, author, publisher, accAge));
                break;
        }
    }
}
