
public class exception1{

    public static void main(String[] args) {
        
        int i=0, j=2;

        int arr[] = new int[5];

        try{
            System.out.println(i/j);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("i and j are 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of bound");
        }

    }

}