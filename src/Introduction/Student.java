package Introduction;

public class Student {
    //Attributes
    String name;
    String address;
    String email;
    String batch;
    double psp;
    String state;

    //Methods
    void changeBatch(String newBatch){
        this.batch = newBatch;
    }
    void pauseCourse(){
        this.state = "PUSHED";
    }
    void  karthik(){
        System.out.println("Karthik");
    }


}
