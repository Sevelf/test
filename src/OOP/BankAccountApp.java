package OOP;

/**
 * Created by vmorozov on 20/11/2018.
 */
public class BankAccountApp {

    public static void main (String[] args) {
        BankAccount acc1 = new BankAccount("COOL", 200);
        //BankAccount acc2 = new BankAccount("NOT_COOL", 300);

        acc1.setName("Roger");
        acc1.setSSN("512125125");
        acc1.setRate();
        acc1.increaseRate();
        System.out.println(acc1.getNmae());
        System.out.println(acc1.getSSN());

        acc1.accountNumber = "95412510";
//        acc1
        //acc2.name = "Nadal";
        //acc2.accountNumber = "986710267910256710";

//        acc1.deposit(1500);
//        acc1.deposit(3000);
//        acc1.withdraw(500);




//        System.out.println(acc1.toString());
//        System.out.println(acc2.toString());

//        CDAccount cd1 = new CDAccount("COOL", 200);
//        cd1.interestRate = "REALLY INTEREESTING!";
//        cd1.compount();
//        System.out.println(cd1.toString());

        //acc2.accountNumber = "986710267910256710";
        //acc2.checkBalance();



    }

}
