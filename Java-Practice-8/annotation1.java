
class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("IN A");
    }
}
class B extends A{

    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("IN B");
    }
}

public class annotation1 {
    
    public static void main(String[] args) {
        
        B obj = new B();

        obj.showTheDataWhichBelongsToThisClass();

    }

}
