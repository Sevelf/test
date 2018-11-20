package OOP;

/**
 * Created by vmorozov on 20/11/2018.
 */
public class BankAccount implements IRate {

    String accountNumber;
    private static final String routingNumber = "5612512";
    private String name;
    private String SSN;
    double balance = 0;

    BankAccount() {
        System.out.println("DEFAULT ACC IS CREATED.");
    }

    BankAccount(String accountType, double initDeposit) {
        System.out.println(accountType + " ACC IS CREATED.");
        balance = balance + initDeposit;
    }

    // getters / setters

    public void setName(String name) {
        this.name = name;
    }

    public String getNmae() {
        return name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        this.showActivity("DEPOSIT");
    }

    // interface methods

    public void setRate() {
        System.out.println("SETTING RATE.");
    }

    public void increaseRate() {
        System.out.println("INCREASING.");
    }

    // classs methods

    private void showActivity(String activity) {
        System.out.println(activity);
        System.out.println("NEW BALANCE IS " + balance);
    }

    void withdraw(double amount) {
        balance = balance + amount;
        this.showActivity("WITHDRAW");
    }

    void checkBalance() {
        System.out.println("Bakance is " + balance);
    }

    void getStatucs() {

    }

    @Override
    public String toString() {
        return "[" + name + ". " + accountNumber + ". " + balance + "].";
    }

}
