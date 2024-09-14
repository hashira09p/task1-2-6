abstract class abstractClass {
    abstract void abstractMethod();
    
    void concreteMethod() { 
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass {
    @Override
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

class C extends abstractClass {
    @Override
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class task126 {
    public static void main(String[] args) {
        B b = new B();
        b.abstractMethod();  // Outputs: B's implementation of abstractMethod.
        b.concreteMethod();  // Outputs: This is a concrete method.
        
        C c = new C();
        c.abstractMethod();  // Outputs: C's implementation of abstractMethod.
        c.concreteMethod();  // Outputs: This is a concrete method.
    }
}

