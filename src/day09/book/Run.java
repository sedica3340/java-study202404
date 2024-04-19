package day09.book;


import util.SimpleInput;

public class Run {
    LibraryView lv = new LibraryView();
    LibraryRepository lr = new LibraryRepository();
    public void init() {
        lr.addBook(new CookBook("기적의 집밥책", "김해진", "청림라이프", true));
        lr.addBook(new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18));
        lr.addBook(new CartoonBook("원펀맨", "One", "대원씨아이", 15));
        lr.addBook(new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false));
        lr.addBook(new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true));
        lr.addBook(new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12));
    }


    public void run() {
        lv.inputName();
        lv.inputAge();
        lv.inputGender();

        menu:
        for (; true; ) {
            String select = lv.menuOpen();
            switch (select) {
                case "1":
                    lv.myPage();
                    break;
                case "2":
                    lv.showAllBook();
                    break;
                case "3":
                    lv.searchForTitle();
                    break;
                case "4":
                    lv.searchForAuthor();
                    break;
                case "5":
                    lv.rentBook();
                    break;
                case "6":
                    lv.showAllRentList();
                    break;
                case "7":
                    lv.getBackBook();
                    break;
                case "8":
                    lv.donateBook();
                    break;
                case "9":
                    lv.exit();
                    break menu;
            }
            SimpleInput.stop();
        }
    }
}
