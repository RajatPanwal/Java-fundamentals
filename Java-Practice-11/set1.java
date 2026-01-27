import java.util.HashSet;
import java.util.Set;

public class set1 {
    
    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet<>();

        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(3);

        System.out.println(nums);

        for(Integer n : nums){
            System.out.println(n);
        }

    }

}
