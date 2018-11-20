package basics;

/**
 * Created by vmorozov on 19/11/2018.
 */
public class Strings {
    public static void main (String[] args) {
        String bookTitle = "The lord of the rings";
        String wordChoice = "Ring";
        if (bookTitle.contains(wordChoice)) {
            System.out.println("YES RING IS HERE");
        }

        String firstName = "Seva";
        String lastName = "Morozov";
        String SSN = "ASDASDAS";

        System.out.println(firstName.substring(0, 1));

        System.out.println(firstName.length());
    }
}
