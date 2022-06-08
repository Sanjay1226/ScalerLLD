package AccessModifiers;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Naman";
        //s.address = "Scaler office"; //address is private
        s.email = "naman@scaler.com";
    }
}
