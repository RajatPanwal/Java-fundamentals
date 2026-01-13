
abstract class Car {

    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing music");
    }

}

class WagonR extends Car {

    public void drive() {
        System.out.println("Driving....");
    }

}

public class abstractClass {

    public static void main(String[] args) {

        Car obj = new WagonR();

        obj.drive();

    }

}