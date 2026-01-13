
class Outer{

    public int a = 20;

    public void show(){
        System.out.println("SHow");
    }

    class Inner{
        public void innerMethod(){
            System.out.println("Inner method");
        }
    }

}

public class innerClass {

    public static void main(String[] args) {
        
        Outer obj = new Outer();

        obj.show();

        Outer.Inner obj2 = obj.new Inner();

        obj2.innerMethod();

    }

}
