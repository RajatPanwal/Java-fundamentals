
class Laptop{
    String modal;
    int price;

    public String toString(){
        return  modal + " : " + price;
    }
    
}

public class objectClass {

    public static void main(String [] args){

        Laptop obj = new Laptop();
        obj.modal = "Lenovo";
        obj.price = 200;

        System.out.println(obj);
        System.out.println(obj.toString());

    }

}
