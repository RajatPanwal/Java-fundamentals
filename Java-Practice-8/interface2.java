
abstract class Computer{
    public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Code, compile, Run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Code, compile, run: Faster");
    }
}


class Developer {

    public void devApp(Computer comp){
        comp.code();
    }

}

public class interface2 {
    
    public static void main(String[] args){

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer rajat = new Developer();
        rajat.devApp(desk);

    }

}
