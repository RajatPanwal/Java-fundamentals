
class Calc {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public final void show() {
        System.out.println("in Calc show");
    }
}

class AdvCalc extends Calc {
    public void show() {
        System.out.println("in AdvCalc show");
    }
}

public class finalClass {

    public static void main(String args[]) {

        AdvCalc obj = new AdvCalc();

        obj.add(2, 4);
        obj.show();

    }

}
