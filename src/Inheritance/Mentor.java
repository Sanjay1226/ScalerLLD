package Inheritance;

import java.util.List;

public class Mentor extends User{
    private List<Student> mentees;
    private String description;

    public void setMentees(List<Student> mentees) {
        this.mentees = mentees;
    }

    public List<Student> getMentees() {
        return mentees;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
