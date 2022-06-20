package Polymorphism;

public class Mentor extends User {

    String comany;
    String description;
    String rating;

    void removeMentee(){};

    @Override
    void changeEmail() {
        System.out.println("change Email in Mentor");
    }
}
