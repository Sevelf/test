package labs;

/**
 * Created by vmorozov on 20/11/2018.
 */
public class StudentApp {

    public static void main (String[] args) {
        Student st1 = new Student("159712957", "Some Guy");
        st1.setCity("Banshee");
        st1.setPhone("158102582");
        st1.setState("AAA");
        System.out.println(st1.toString());
        // -----------------------------------
        Student st2 = new Student("559716512", "Awesome Dude");
        st2.setCity("London");
        st2.setPhone("6971236906");
        st2.setState("LKLL");
        System.out.println(st2.toString());
        // -----------------------------------
        Student st3 = new Student("671293081", "Nice Girl");
        st3.setCity("Riga");
        st3.setPhone("90719027350");
        st3.setState("RRRR");
        System.out.println(st3.toString());
    }

}

class Student {
    private static int ID = 100;
    private String userID;
    private String SSN;
    private String name;
    private String email;
    private String phone;
    private String city;
    private String state;


    public Student(String SSN, String name) {
        setSSN(SSN);
        setName(name);
        generateEmail();
        generateUserID();
        ID ++;
    }

    // Getters / Setters

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserID() {
        return userID;
    }

    public String getSSN() {
        return SSN;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getState() {
        return state;
    }
    // Custom methods

    private void generateEmail() {
         email = name.replaceAll("\\s+","").toLowerCase() + "@students-mail.com";
    }

    private void generateUserID() {
        int random = (int) (Math.random() * 10000);
        if (random < 1000) {
            random += 1000;
        } else if (random > 9000) {
            random -= 1000;
        }
        userID = this.ID + "" + random + "" + SSN.substring(SSN.length() - 4, SSN.length());
    }

    public void enroll() {
        System.out.println("Enroll.");
    }

    public void pay() {
        System.out.println("Pay.");
    }

    public void checkBalance() {
        System.out.println("Check balance.");
    }

    @Override
    public String toString() {
        return "[Name: " + name +  "][Email: " + email + "][User ID: " + userID + "]\n[City: " + city +  "][Phone: " + phone + "][State: " + state + "]";
    }

    public void showCourses() {
        System.out.println("Show courses.");
    }
}