
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
        
        Outer obj1 = new Outer();

        obj1.show();

        // syntax to class inner class
        Outer.Inner obj2 = obj1.new Inner();

        obj2.innerMethod();

    }

}
