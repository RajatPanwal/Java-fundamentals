
public class wrapperClass{

    public static void main(String[] args){

        int num = 20;
        Integer num1 = num; //autoboxing

        // int num2 = num1.intValue(); //unboxing
        int num2 = num1;

        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3);

    }

}