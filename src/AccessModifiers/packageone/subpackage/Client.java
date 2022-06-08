package AccessModifiers.packageone.subpackage;

import AccessModifiers.packageone.Student;

public class Client {
    public static void main(String[] args) {

        Student student = new Student();

       // student.name = "Naman" // name is Default in Student class and default attribute we can access from outside of package
    }
}
