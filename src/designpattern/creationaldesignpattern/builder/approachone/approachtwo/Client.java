package designpattern.creationaldesignpattern.builder.approachone.approachtwo;

public class Client {
    public static void main(String[] args) {
        UserExam userExam;
        try{
            userExam = UserExam.getBuilder()
                    .setEnglishMarks(12)
                    .setScienceMarks(23)
                    .setMathsMarks(23)
                    .setName("Naman")
                    .build();
            userExam = UserExam.getBuilder().build();

        }catch (Exception exception){

        }
    }
}
