package basics;

/**
 * Created by vmorozov on 19/11/2018.
 */
public class NumbersCalc {

    public static void main (String[] args) {
        printName();
        int numA = 30;
        int numB = 40;
        addNumbers(numA, numB);
        System.out.println(multipleNumbers(numA, numB));
    }

    static void printName() {
        System.out.println("My name is Seva");
    }

    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum " + a + " and " + b + " is " + sum + ".");
    }

    static int multipleNumbers(int a, int b) {
        int product = a * b;
        return product;
    }

}
