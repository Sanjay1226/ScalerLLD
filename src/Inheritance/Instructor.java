package Inheritance;

public class Instructor extends User {
    private String assinedBatch;
    private String description;

    public void setAssinedBatch(String assinedBatch) {
        this.assinedBatch = assinedBatch;
    }

    public String getAssinedBatch() {
        return assinedBatch;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
