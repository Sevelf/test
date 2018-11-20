package labs;

/**
 * Created by vmorozov on 20/11/2018.
 */
public class BankAccountApp {

    public static void main (String[] args) {
        BankAccount ba1 = new BankAccount("1251234", 1000.50);
        BankAccount ba2 = new BankAccount("6283756", 2000);
        BankAccount ba3 = new BankAccount("6701237", 3000);

        ba1.setName("Jim");
        System.out.println(ba1.getName());
        ba1.makeDeposit(100);
        ba1.makeDeposit(500);
        ba1.payBill(50);
        ba1.accrue();
        ba1.showBalance();
        System.out.println(ba1.toString());

    }

}

class BankAccount implements IInterest{
    // Properties of bank account
    private static int ID = 1000;               // Internal ID
    private String accountNumber; // ID + random 2-digit number + first 2 of SSN
    private static final String routingNumber = "005400657";
    private String name;
    private String SSN;
    private double balance;

    // Counstructor
    public BankAccount(String SSN, double deposit) {
        this.SSN = SSN;
        balance = deposit;
        ID++;
        setAccountNumber();
    }

    private void setAccountNumber() {
        int random = (int) (Math.random() * 100);
        accountNumber = ID + "" + random + SSN.substring(0, 2);
        System.out.println("Account Number:" + accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void payBill(double amount) {
        balance -= amount;
    }
    public void makeDeposit(double amount) {
        balance += amount;
    }

    public void showBalance() {
        System.out.println("Balance is " + balance);
    }

    public void accrueInterest() {

    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate / 100); // rate from Interface IInterest
    }

    @Override
    public String toString() {
        return "[Name: " + name +  "]\n[Account Number: " + accountNumber + "]\n" + "[Routing number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
    }
}