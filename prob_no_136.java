public interface prob_no_136 {
    public static int singleNumber(int[] nums) {
        int min=0;
         for(int i : nums)
         {
           min^=i;
         }  
         return min;
       }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {1,2,3,2,3}));
    }
}

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
