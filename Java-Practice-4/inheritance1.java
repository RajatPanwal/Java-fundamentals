
class Calc{

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

}

class AdvCalc extends Calc{

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }

}

public class inheritance1 {
    
    public static void main(String[] args){

        AdvCalc obj = new AdvCalc();

        int r1 = obj.add(20, 10);
        int r2 = obj.sub(20, 10);
        int r3 = obj.mul(20, 10);
        int r4 = obj.div(20, 10);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }

}
