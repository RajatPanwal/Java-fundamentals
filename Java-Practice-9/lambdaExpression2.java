
@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class lambdaExpression2 {

    public static void main(String[] args) {

        A obj = (i, j) -> i + j;

        int result = obj.add(2, 3);
        System.out.println(result);

    }

}
