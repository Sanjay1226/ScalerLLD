package designpattern.creationaldesignpattern.singleton.impone;

import singleton.impone.Database;
import singleton.impone.Random;

public class Main {
    public static void main(String[] args) {
        Database bd = Database.getInstance();
        Database database = Database.getInstance();


        Random random = new Random();
    }
}
