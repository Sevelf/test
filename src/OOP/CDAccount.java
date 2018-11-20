package OOP;

/**
 * Created by vmorozov on 20/11/2018.
 */
public class CDAccount extends BankAccount implements IRate {

    String interestRate;

    void compount() {
        System.out.println(interestRate);
    }

}
