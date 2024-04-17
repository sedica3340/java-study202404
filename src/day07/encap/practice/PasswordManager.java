package day07.encap.practice;

public class PasswordManager {
    private String password;

    PasswordManager(String password){
        this.password = password;
    }
    public boolean changePassword(String password, String newPassword) {
        if (password.equals(this.password)) {
            this.password = newPassword;
            return true;
        } else return false;
    }

}
//        // PasswordManager 클래스 테스트
//        PasswordManager pm = new PasswordManager("oldPassword123");
//        boolean isChanged = pm.changePassword("oldPassword123", "newPassword123");
//        System.out.println("Password changed: " + isChanged); // true
//