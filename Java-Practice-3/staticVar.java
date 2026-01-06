
class Mobile {

    String brand;
    int price;

    // static make the variable common to all the object with same value(address)
    static String name;

    void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class staticVar {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1300;
        obj2.name = "SmartPhon";

        obj1.show();
        obj2.show();

    }

}
