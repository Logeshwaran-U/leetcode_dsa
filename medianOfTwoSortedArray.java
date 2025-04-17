import java.util.Arrays;
class medianOdTwoSortedArray{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length+nums2.length,i,k=0;
        int n1[] = new int[totalLength];

        for(i=0;i<nums1.length;i++)
        {
            n1[k] =nums1[i];
            k++;
        }
        for(i=0;i<nums2.length;i++)
        {
            n1[k] = nums2[i];
            k++;
        }
        Arrays.sort(n1);

        if(totalLength %2 == 0)
        {
            return (n1[totalLength/2]+n1[(totalLength/2)-1])/2.0;
        }
        else{
            return n1[totalLength /2 ];
        }
        
    }
    public static void main(String[] args) {
        
        System.out.println(findMedianSortedArrays(new int[] {2,2,4,4},new int[] {2,2,2,4,4}));

    }
}