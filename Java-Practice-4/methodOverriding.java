class A {
    public int add(int a, int b) {
        return a + b;
    }
}

class B extends A {
    public int add(int a, int b) {
        return a + b + 1;
    }
}

public class methodOverriding {

    public static void main(String[] args) {

        B obj = new B();

        int r1 = obj.add(3, 5);

        System.out.println(r1);

    }

}
