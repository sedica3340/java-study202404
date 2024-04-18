package day08.enum_.practice;

public enum TeamRole {
    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");

    private String todo;

    TeamRole(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }
}