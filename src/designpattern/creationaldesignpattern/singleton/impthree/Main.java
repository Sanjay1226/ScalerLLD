package designpattern.creationaldesignpattern.singleton.impthree;

import singleton.impthree.Database;
import singleton.impthree.Random;

public class Main {
    public static void main(String[] args) {
        Database bd = Database.getInstance();
        Database database = Database.getInstance();

        Random random = new Random();
    }
}
