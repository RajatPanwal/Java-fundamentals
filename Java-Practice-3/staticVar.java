
class Mobile {

    String brand;
    int price;

    // static make the variable common to all the object with same value(address) - shared by all objects
    // static variable belongs to the class and not to the object, ie why it is called like this - Mobile.name = ""
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
        // obj1.name = "SmartPhone";

        // correct way to call a static variable, instead of calling it with an obj 
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1300;
        obj2.name = "Phone";

        obj1.show();
        obj2.show();

    }

}
