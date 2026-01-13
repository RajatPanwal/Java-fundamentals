
class A{
    public void show(){
        System.out.println("in A");
    }
}

public class anonymousClass {

    public static void main(String[] args){

        A obj = new A(){
            public void show(){
                System.out.println("in anonymousClass");
            }
        };

        obj.show();

    }
    
}
