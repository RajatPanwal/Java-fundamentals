
class Human{

    private int age = 20;
    private String name = "Rajat";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class encapsulation1{

    public static void main(String[] args){

        Human obj = new Human();

        // obj.age = 20;
        // obj.name = "Rajat";

        System.out.println(obj.getName() + " : " + obj.getAge());

    }

}