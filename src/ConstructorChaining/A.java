package ConstructorChaining;

public class A {
    int a;
    private  int b;

    //Default Constructor
    public A(){
        System.out.println("Constructor of A");
        this.a = 1;
        this.b =2;
    }
    // Parametrise Constructor
    public A(String name){
        System.out.println("Constructor of A" + name);
    }
}
