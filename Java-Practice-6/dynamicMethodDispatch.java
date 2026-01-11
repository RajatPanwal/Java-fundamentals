
class A{
    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}

public class dynamicMethodDispatch {

    public static void main(String a[]){

        A o = new B();
        o.show();

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

    }

}
