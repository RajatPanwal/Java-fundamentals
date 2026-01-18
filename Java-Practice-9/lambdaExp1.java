
@FunctionalInterface
interface A{
    void show(int i);
}

public class lambdaExp1 {

    public static void main(String[] args){

        A obj = (i) -> System.out.println("IN SHOW " + i);

        obj.show(3);
 
    }

}
