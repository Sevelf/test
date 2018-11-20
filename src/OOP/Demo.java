package OOP;

/**
 * Created by vmorozov on 20/11/2018.
 */

class Person {

    String name;
    String email;
    String phone;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

}

public class Demo {

    public static void main (String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Seva";
        p1.phone = "123123123123";
        p1.walk();
        p1.eat();
        p2.name = "Stas";
        p2.phone = "asdasdas";
        p2.walk();
        p2.eat();

//        // Person
//
//        // adjectives, descriptors
//        String name = "Seva";
//        int phone = 123125123;
//
//        // activity
//        walking(name);
//        //System.out.println(name + " is walking");
    }

//    static void walking(String name) {
//        System.out.println(name + " is walking");
//    }
}
