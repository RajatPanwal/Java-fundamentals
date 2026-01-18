
@FunctionalInterface
interface A {
    void show();
}

public class functionalInterface1 {

    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("IN SHOW");
            }
        };

        obj.show();

    }

}
