import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {
    
    public static void main(String[] args){

        List<Integer> nums = new ArrayList<>();

        nums.add(3);
        nums.add(7);
        nums.add(2);
        nums.add(6);
        nums.add(0);

        Collections.sort(nums);

        System.out.println(nums);

    }

}
