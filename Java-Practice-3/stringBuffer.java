
public class stringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // string buffer modify same object directly instead of creating new one
        StringBuffer sb2 = new StringBuffer("Rajat");
        System.out.println(sb2.capacity());

        sb2.append("Panwal");
        System.out.println(sb2);
        System.out.println(sb2.capacity());

    }

}