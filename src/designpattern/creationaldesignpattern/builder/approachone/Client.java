package designpattern.creationaldesignpattern.builder.approachone;

public class Client {
    public static void main(String[] args) {
        UserExamParameter parameter = new UserExamParameter();
        parameter.englishMarks = 50;
        parameter.scienceMarks = 100;
        parameter.mathsMarks = 50;
        parameter.name = "Naman";

        UserExam userExam;
        try{
            userExam = new UserExam(parameter);
        }catch (Exception exception){
            System.out.println("Some papameter are wrong"+exception.getMessage());
        }
    }
}
