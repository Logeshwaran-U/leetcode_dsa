import java.util.Arrays;

public class prob_no_169 {
    public static int majorityElement(int[] nums) {
     
        Arrays.sort(nums);
        return nums[nums.length/2];   
    }
    public static void main(String[] args) {
        System.err.println(majorityElement(new int[] {2,2,2,2,2,1,1,1,1}));
    }
}

// note:If array is sorted, then the middle element (at index n/2) is always the majority element.
