
class Human{

    private int age;
    private String name;

    // constructor
    public Human(){
        System.out.println("inside constructor");
    }

    // parameterized constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    } 

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

public class constructor1{

    public static void main(String[] args){

        Human obj = new Human();
        Human obj2 = new Human(20, "Panwal");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());


    }

}