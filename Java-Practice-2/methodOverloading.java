// only change in parameters matters, not even type of method
class Calculator {

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

}

public class methodOverloading {

    public static void main(String[] args) {

        // cal is not an object like in c++, it is a reference variable
        Calculator cal = new Calculator();

        int two = cal.add(2, 4);
        System.out.println(two);

        int three = cal.add(2, 4, 3);
        System.out.println(three);

        double dob = cal.add(2.2, 2.2);
        System.out.println(dob);

    }

}