package abstractclass;

public class Instructor extends User {
    private String assignedBatch;
    private String description;

    Instructor() {
        super("Instructor");
    }

    public String getAssignedBatch() {
        this.setName("Naman");
        return assignedBatch;
    }

    public void setAssignedBatch(String assignedBatch) {
        this.assignedBatch = assignedBatch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    void saySomething() {
        System.out.println("Solve your assisgments");
    }
}
