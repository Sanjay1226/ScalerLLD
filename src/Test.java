import java.math.BigInteger;
import java.security.PublicKey;
import java.util.Scanner;

enum Season{
    WINTER,SPRING,SUMMER
}

public class Test {

    public static void main(String[] args) {

        for(Season s:Season.values()){
            System.out.println(s);
        }

        int a =100;
        System.out.println(~a);

    }

}
