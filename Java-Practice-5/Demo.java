import tools.*;

public class Demo {
    
    public static void main(String[] args){

        Calc obj = new Calc();
        AdvCalc obj2 = new AdvCalc();

        int r1 = obj.add(2,3);
        int r2 = obj2.mul(2,3);

        System.out.println(r1);
        System.out.println(r2);

    }

}
