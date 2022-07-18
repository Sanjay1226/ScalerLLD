package designpattern.creationaldesignpattern.singleton.imptwo;

import singleton.imptwo.Database;
import singleton.imptwo.Random;

public class Main {
    public static void main(String[] args) {
        Database bd = Database.getInstance();
        Database database = Database.getInstance();


        Random random = new Random();
    }
}
