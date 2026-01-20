
public class exception1{

    public static void main(String[] args) {
        
        int i=0, j=0;

        try{
            System.out.println(i/j);
        }
        catch(Exception e){
            System.out.println("i and j are 0");
        }

    }

}