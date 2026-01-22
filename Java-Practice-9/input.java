import java.io.IOException;
import java.util.Scanner;

public class input{

    public static void main(String[] args) {
        
        System.out.println("Enter a number: ");
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);
    }

}