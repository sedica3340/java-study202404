package day07.encap.practice;

public class Student {
    private String name;
    private String studentId;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (!studentId.isEmpty()) {
            this.studentId = studentId;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (!department.isEmpty()) {
            this.department = department;
        }
    }
}
//        // Student 클래스 테스트
//        Student student = new Student();
//        student.setName("박영희");
//        student.setStudentId("S001");
//        student.setDepartment("Computer Science");
//        System.out.println("학생 이름: " + student.getName());
//        System.out.println("학번: " + student.getStudentId());
//        System.out.println("전공: " + student.getDepartment());
//