
enum Status{
    Active, Inactive, Failed, Pending;
}

public class enum1 {
    
    public static void main(String[] args){

        Status s = Status.Active;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss = Status.values();
        for(Status i : ss){
            System.out.println(i);
        }

    }

}
