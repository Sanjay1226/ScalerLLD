package singleton.impthree;

public class Database {
    private static Database instace = null;
    private Database(){}

    synchronized public static Database getInstance(){
        if(instace == null)
                    if(instace == null){
                        instace = new Database();
                    }
        return instace;
    }
}
