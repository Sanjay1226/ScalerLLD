package designpattern.creationaldesignpattern.builder.approachone;

import java.security.InvalidParameterException;

public class UserExam {

    private int englishMartks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public UserExam(UserExamParameter userExamParameter){
        if(userExamParameter.englishMarks>100 || userExamParameter.scienceMarks>100||
        userExamParameter.mathsMarks >100){
            throw new InvalidParameterException("Marks can't be greater the 100");
        }
        if(userExamParameter.mathsMarks + userExamParameter.englishMarks > 150){
            throw new InvalidParameterException("math and english marks can't be greater then 150");
        }
        this.englishMartks = userExamParameter.englishMarks;
        this.mathsMarks = userExamParameter.mathsMarks;;
        this.scienceMarks = userExamParameter.scienceMarks;
        this.name = userExamParameter.name;
    }
    public int getEnglishMartks(){
        return englishMartks;
    }
}
