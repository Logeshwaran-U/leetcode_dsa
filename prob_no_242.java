import java.util.Arrays;

public class prob_no_242 {
    public static boolean isAnagram(String s, String t) {

         if (s.length() != t.length()) {
            return false;
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
        arr = t.toCharArray();
        Arrays.sort(arr);
        t = new String(arr);
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != t.charAt(i))
            {
                return false;
            }
            
        }
      
    return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("hello", "hello"));
    }
}

// An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once.

// "listen" ---> "silent"

// "triangle" ---> "integral"

/*Not Anagrams: */

// "hello" & "hell" →  Not same length

// "abc" & "abd" → Different letters

