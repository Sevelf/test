package OOP;

/**
 * Created by vmorozov on 20/11/2018.
 */
public class LoanAccount implements IRate{

    @Override
    public void setRate() {
        System.out.println("Rate");
    }

    @Override
    public void increaseRate() {
        System.out.println("Increase");
    }

    public void setTerm(int term) {
        System.out.println("Setting terms to " + term);
    }

    public void setAmmortSchedule() {
        System.out.println("setAmmortSchedule");
    }
}
