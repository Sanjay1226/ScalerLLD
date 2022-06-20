package Polymorphism;

import java.util.List;

public class Main {

    public static void  changePasswardOfAllUsers(List<User> users){
        for(User user : users){
            user.changeEmail();
            if(user instanceof Student) {
                System.out.println("I am Student");
                Student student = (Student) user;
                student.changeBatch();
            }
        }
    }
    public static void main(String[] args) {

        User user = new TA();

        User user1 = new Student();
        User user2 = new Mentor();
        User user3 = new User();

        List<User> users = List.of(
                user1,
                user2,
                user3,
                new Student(),
                new Mentor()
        );
       changePasswardOfAllUsers(users);
    }
}
