package AccessModifiers;

public class Student {
    String name;
    private String address;
    public String email;
    String batch;
    double psp;
    String state;

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
