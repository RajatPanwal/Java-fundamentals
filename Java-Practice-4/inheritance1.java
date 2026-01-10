
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

class VeryAdvCalc extends AdvCalc{

    public int power(int a, int b){
        return (int)Math.pow(a, b);
    }

}

public class inheritance1 {
    
    public static void main(String[] args){

        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 = obj.add(20, 10);
        int r2 = obj.sub(20, 10);
        int r3 = obj.mul(20, 10);
        int r4 = obj.div(20, 10);
        int r5 = obj.power(4, 2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }

}
