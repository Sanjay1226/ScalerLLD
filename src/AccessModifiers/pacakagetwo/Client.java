package AccessModifiers.pacakagetwo;

import AccessModifiers.packageone.Student;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();

       // s.name = "Naman"; // Default we can not access out side of the pacakage
        //s.address = "Scaler office"; //address is private
        s.email = "naman@scaler.com";
    }
}
