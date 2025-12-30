
class Calculator {

    int a = 2;

    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

}

public class classes1 {

    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 9;

        Calculator cal = new Calculator();

        int result = cal.add(num1, num2);

        System.out.println(result);
    }

}