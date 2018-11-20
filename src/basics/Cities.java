package basics;

/**
 * Created by vmorozov on 19/11/2018.
 */
public class Cities {

    public static void main (String[] args) {
        String[] letters = {"A", "B", "C", "D", "E"};
        //System.out.println(letters[0]);

        int index = 0;

        do {
            System.out.print(letters[index]);
            System.out.println(index);
            index ++;
        } while (index < letters.length);

        System.out.println("__________________________________");

        int index3 = 0;
        while (index3 < letters.length) {
            System.out.print(letters[index3]);
            System.out.println(index3);
            index3++;
        }

        System.out.println("__________________________________");

        for (int index2 = 0; index2 < letters.length; index2++) {
            System.out.print(letters[index2]);
            System.out.println(index2);
        }

    }

}
