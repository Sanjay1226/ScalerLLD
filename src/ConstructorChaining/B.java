package ConstructorChaining;

public class B extends A {

    private int c;
    public B(){
        //Calling Constructor of A
        super("Naman");
        this.a = 12;
        this.c = 3;
        System.out.println("Constructor of B");
    }
}
