
class A{
    public A(){
        System.out.println("A constructor");
    }
    public A(int a){
        System.out.println("A parameterized constructor");
    }
}

class B extends A{
    public B(){
        System.out.println("B constructor");
    }
    public B(int b){
        System.out.println("B parameterized constructor");
    }
}

public class superMethod {
    
    public static void main(String[] args){

        B obj = new B();

    }

}
