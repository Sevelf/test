package basics;

/**
 * Created by vmorozov on 19/11/2018.
 */
public class SalaryCalculator {
    public static void main(String[] args){
        // our career
        String career;
        //System.out.println("Program is starting");
        career = "Software developer";
        //System.out.println("My career is: " + career);

        int hoursPerWeek = 40;
        int weeksPerYear = 40;
        double rate = 42;

        if (1 == 2) {
            System.out.println("asd");
        }

        switch (weeksPerYear) {
            case 40: System.out.println("40");
            case 41: System.out.println("41");
            case 42: System.out.println("42");
            case 43: System.out.println("43");
            case 44: System.out.println("44");
            case 45: System.out.println("45");
            default: System.out.println("default");
        }

        // computer our salary
        // rate * hoursPerWeek * weeksPerYear

        double salary = hoursPerWeek * weeksPerYear * rate;
        //System.out.println("My salary as a " + career + " is: " + salary);

    }
}
