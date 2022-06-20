package singleton.impone;

public class Database {
    private static Database instace = null;
    private Database(){}

    public static Database getInstance(){
        if(instace == null)
            instace = new Database();
        return instace;
    }
}
