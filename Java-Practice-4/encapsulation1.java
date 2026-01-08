
class Human{

    private int age = 20;
    private String name = "Rajat";

    // getter
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    // setter
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class encapsulation1{

    public static void main(String[] args){

        Human obj = new Human();

        obj.setAge(20);
        obj.setName("Rajat");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }

}