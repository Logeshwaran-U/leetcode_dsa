// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].
import java.util.Arrays;

public class probNo_34 {
    public static int[] searchRange(int[] nums, int target) {
        
        int first =-1,last=-1,i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(first == -1)
                {
                    first = i;
                }
                
                    last = i;
            }

        }
        
            return new int[] {first,last};
        
    }
    public static void main(String[] args) {
     System.out.println(Arrays.toString( searchRange(new int[]{1}, 1)));   
    }    
}
