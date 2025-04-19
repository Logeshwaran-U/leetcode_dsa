// qno 2873 find the triplets
public class daily_challenge {
    
        public static long maximumTripletValue(int[] nums) {
            int i=0,j=0,k=0;
            long n=0,val=0;
            for(i=0;i<nums.length;i++)
            {
                for(j=i+1;j<nums.length;j++)
                {
                    for(k=j+1;k<nums.length;k++){
                        val= (long)(nums[i] - nums[j]) * nums[k];
                        if(val>n)
                        {
                            n=val;
                        }
                    }
                }
            }
            if(n>0)
            {
                return n;
            }
            else{
                return 0;
            }
        }
    

    public static void main(String[] args) {
        System.out.println(maximumTripletValue(new int[] {12,6,1,2,7}));
    }
}
