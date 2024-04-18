package day08.static_.practice;

public class Department {

    private String departmentName;
    private int studentCount;
    static int totalStudents;

    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudents += studentCount;
    }

    void addStudent(int number) {
        this.studentCount += number;
        totalStudents += number;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
