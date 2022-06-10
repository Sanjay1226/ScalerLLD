package Inheritance;

public class User {
    private String name;
     private String email;
     private String password;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public  String getPassword(){
        return password;
    }

    void saySomething(){
        System.out.println("Something");
    }
     void updateEmail(String newEmail){
        this.email = newEmail;
     }
     void chnagePassword(String newPassword){
        this.password = newPassword;
     }


}
