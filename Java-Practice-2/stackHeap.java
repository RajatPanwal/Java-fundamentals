
class Calculator{
    int num = 5;

    int add(int n1, int n2){
        return n1 + n2;
    }
}

public class stackHeap{

    public static void main (String[] args){

        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        obj1.num = 8;

        System.out.println(obj1.num);
        System.out.println(obj2.num);

    }

}