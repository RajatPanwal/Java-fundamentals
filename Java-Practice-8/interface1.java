
interface A {

    int age = 23;

    void show();
    void config();
}

class B implements A {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("In config");
    }

}

public class interface1 {

    public static void main(String[] args) {

        A obj;
        obj = new B();

        System.out.println("getClass() " + obj.getClass());

        obj.show();
        obj.config();

        System.out.println(A.age);

    }

}
