package singleton.impthree;

public class Database {
    private static Database instace = null;
    private Database(){}

     public static Database getInstance(){
        if(instace == null) {
            synchronized (instace = new Database()) {
                if (instace == null) {
                    instace = new Database();
                }
            }


        }
        return instace;
    }
}
