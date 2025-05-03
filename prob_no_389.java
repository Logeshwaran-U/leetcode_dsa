import java.util.Arrays;

public class prob_no_389 {
public static char findTheDifference(String s, String t) {
        
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return arr2[i];
            }
        }
        return arr2[arr2.length-1];
    }
    public static void main(String[] args) {
     System.out.println(findTheDifference("abcd", 
    "aebcd"));   
    }
    
}
