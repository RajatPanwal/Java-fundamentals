
final class Calc{
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{
    public void show(){
        System.out.println("in show");
    }
}

public class finalClass {

    public static void main(String args[]){

        AdvCalc obj = new AdvCalc();

        obj.add(2, 4);

    }

}
