package Inheritance;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Instructor instructor  = new Instructor();
        instructor.setName("Naman");
        instructor.setDescription("Super Cool");
       // instructor.name  = "Naman"; // from parent class
       // instructor.description = "Super Cool";
        instructor.saySomething();
        System.out.println("-------- Instructor information --------");
        System.out.println(instructor.getName());
        System.out.println(instructor.getDescription());

        User user = new User();
      //  user.name = "Karthik";

        Mentor mentor = new Mentor();
       // mentor.setMentees(new ArrayList<>(35.43,"Super"));
       // mentor.name = "Abhimanyu";
       // mentor.email = "abhimanyu@scaler.com";
       // mentor.description = "Boss";
        Student student = new Student();
       // student.getMentor();
    }
}
