package singleton.impthree;

public class Main {
    public static void main(String[] args) {
        Database bd = Database.getInstance();
        Database database = Database.getInstance();

        Random random = new Random();
    }
}
