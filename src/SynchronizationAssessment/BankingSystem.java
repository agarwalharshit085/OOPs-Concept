package SynchronizationAssessment;

class BankAccount {
    private int balance;
    public BankAccount(int balance) {
        this.balance = balance;
    }
    public void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " successfully withdrew. Remaining balance: " + balance);
        } else {
            System.out.println(name + " attempted to withdraw " + amount + " but insufficient funds! Balance: " + balance);
        }
    }
    public int getBalance() {
        return balance;
    }
}
class User extends Thread {
    private BankAccount account;
    private String userName;
    private int amountToWithdraw;

    public User(BankAccount account, String userName, int amountToWithdraw) {
        this.account = account;
        this.userName = userName;
        this.amountToWithdraw = amountToWithdraw;
    }
    @Override
    public void run() {
        account.withdraw(userName, amountToWithdraw);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance: 1000
        // Creating multiple users trying to withdraw money simultaneously
        User user1 = new User(account, "User1", 700);
        User user2 = new User(account, "User2", 500);
        User user3 = new User(account, "User3", 300);
        user1.start();
        user2.start();
        user3.start();
    }
}
