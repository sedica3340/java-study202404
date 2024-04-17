package day07.encap.practice;

public class BankAccount {
    private int balance;
    private String accountNumber;
    private String accountHolder;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    BankAccount(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(int money) {
        this.balance += money;
    }
    public void withdraw(int money) {
        if(money <= this.balance) {
            this.balance -= money;
        }
    }
}
//BankAccount myAccount = new BankAccount("123-456-789", "김철수", 10000);
//        System.out.println("현재 잔액: " + myAccount.getBalance());
//        myAccount.deposit(50000);
//        System.out.println("입금 후 잔액: " + myAccount.getBalance()); // 60000 출력
//        myAccount.withdraw(20000);
//        System.out.println("출금 후 잔액: " + myAccount.getBalance()); // 40000 출력
