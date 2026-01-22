
public class exception2 {

    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if(j == 0){
                throw new ArithmeticException("I don't want to print 0");
            }
        } catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("Arithmetic Exception: " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println("j : " + j);
        System.out.println("END");
    }

}
