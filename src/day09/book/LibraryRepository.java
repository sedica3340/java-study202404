package day09.book;

public class LibraryRepository {

    private static BookUser bookUser;

    private static Book[] bookList;

    private static Book[] rentList;

    static {
        bookList = new Book[0];
        rentList = new Book[0];
    }

    public static Book[] getRentList() {
        return rentList;
    }

    public static void setRentList(Book[] rentList) {
        LibraryRepository.rentList = rentList;
    }

    public static Book[] getBookList() {
        return bookList;
    }

    public static void setBookList(Book[] bookList) {
        LibraryRepository.bookList = bookList;
    }

    public static BookUser getBookUser() {
        return bookUser;
    }

    public static void setBookUser(BookUser bookUser) {
        LibraryRepository.bookUser = bookUser;
    }

    public void addBook(Book book) {
        Book[] temp = new Book[bookList.length + 1];
        for (int i = 0; i < bookList.length; i++) {
            temp[i] = bookList[i];
        }
        temp[bookList.length] = book;
        bookList = temp;
    }

    public static void switchBook(int index) {
        Book[] temp = new Book[bookList.length - 1];
        Book[] temp2 = new Book[rentList.length + 1];
        for (int i = 0; i < bookList.length; i++) {
            if (i < index) {
                temp[i] = bookList[i];
            } else if (i > index) {
                temp[i - 1] = bookList[i];
            }
        }
        for (int i = 0; i < rentList.length; i++) {
            temp2[i] = rentList[i];
        }
        temp2[temp2.length - 1] = bookList[index];
        bookList = temp;
        rentList = temp2;
    }

    public static void giveBackBook(int index) {
        Book[] temp = new Book[rentList.length - 1];
        Book[] temp2 = new Book[bookList.length + 1];
        for (int i = 0; i < rentList.length; i++) {
            if (i < index) {
                temp[i] = rentList[i];
            } else if (i > index) {
                temp[i - 1] = rentList[i];
            }
        }
        for (int i = 0; i < bookList.length; i++) {
            temp2[i] = bookList[i];
        }
        temp2[temp2.length - 1] = rentList[index];
        rentList = temp;
        bookList = temp2;
    }
}
