package day08.enum_.practice;

public class TeamMember {
    private String name;
    private TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        switch(this.role) {
            case LEADER:
                System.out.printf("%s is assigned %s\n", this.name, TeamRole.LEADER.getTodo());
                break;
            case DEVELOPER:
                System.out.printf("%s is assigned to %s\n", this.name, TeamRole.DEVELOPER.getTodo());
                break;
            case DESIGNER:
                System.out.printf("%s is assigned %s\n", this.name, TeamRole.DESIGNER.getTodo());
                break;
            case TESTER:
                System.out.printf("%s is assigned %s\n", this.name, TeamRole.TESTER.getTodo());
                break;
        }
    }
}
