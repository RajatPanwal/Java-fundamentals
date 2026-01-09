
class Human{

    private int age;
    private String name;

    public Human(){
        System.out.println("inside constructor");
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
        Human obj2 = new Human();

        System.out.println(obj.getName() + " : " + obj.getAge());


    }

}