
class A {
    public char[] a;

    public A() {
        super();
        System.out.println("A constructor");
    }

    public A(int a) {
        super();
        System.out.println("A parameterized constructor");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B constructor");
    }

    public B(int b) {
        this();
        System.out.println("B parameterized constructor");
    }
}

public class superMethod {

    public static void main(String[] args) {

        B obj = new B(5);

    }

}
