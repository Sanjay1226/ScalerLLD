package overriding;

public class B extends A {
    @Override
    void doSomething() {
        System.out.println("I am B");
      //  super.doSomething();
    }
}
