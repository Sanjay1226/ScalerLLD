package Constructor;

public class Student {
    int age;
    String name;
    String address = "Scalerverse";
    String email;
    String batch;
    double psp;
    String state;

    //parameter constructor
    Student(String name, String address){
        this.name = name;
        this.address = address;
    }

    //Default constuctor
    Student(){}

    Student(Student other){
        name = other.name;
        address = other.address;
        batch = other.batch;
        email = other.email;
        psp = other.psp;
        state = other.state;
    }

    void changeBatch(String newBatch){
        this.batch = newBatch;
    }
    void pauseCourse(){
        this.state = "PUSHED";
    }
    void karthik(){
        System.out.println("karthik");
    }
}
