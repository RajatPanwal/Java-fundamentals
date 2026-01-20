
public class exception1{

    public static void main(String[] args) {
        
        int i=0, j=2;

        int arr[] = new int[5];

        String str = null;

        try{
            System.out.println(i/j);
            System.out.println(arr[5]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("i and j are 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of bound");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

    }

}