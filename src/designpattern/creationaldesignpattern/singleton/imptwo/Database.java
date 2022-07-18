package designpattern.creationaldesignpattern.singleton.imptwo;

public class Database {
    private static Database instace = new Database();
    private Database(){}

    public static Database getInstance(){
        return instace;
    }
}
