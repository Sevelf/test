package OOP;

/**
 * Created by vmorozov on 20/11/2018.
 */
public class AccountApp {

    public static void main (String[] args) {
        LoanAccount la = new LoanAccount();
        la.setRate();
        la.increaseRate();
        la.setAmmortSchedule();
        la.setTerm(50);


        IRate account1 = new LoanAccount();
        account1.increaseRate();
        account1.setRate();
    }
}
