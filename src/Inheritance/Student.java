package Inheritance;

public class Student extends User{

    private double psp;
    private String batch;
    private Mentor mentor;


    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getPsp() {
        return psp;
    }
    public void setBatch(String batch){
        this.batch = batch;
    }
    public String getBatch(){
        return batch;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Mentor getMentor() {
        return mentor;
    }
}
