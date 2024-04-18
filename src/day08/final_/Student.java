package day08.final_;

public class Student {
    String name;
    final String ssn;
    static final String nation;

    static {
        nation = "대한민국";
    }

    Student(final String ssn) {
        this.ssn = ssn;
    }
}
