package Polymorphism;

public class TA extends  User{
    String expertise;
    String comapny;

    void takeHelpRequest(){}

    @Override
    void changeEmail() {
        System.out.println("Change Email in TA");
    }
}
