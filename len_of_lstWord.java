public class len_of_lstWord {
    public static int lengthOfLastWord(String s) {
        int i=s.length()-1 ,count=0;
        while(i>=0 && s.charAt(i) == ' ' )
       {
           i--;
       }
       while(i>=0 && s.charAt(i) !=' ')
       {
           count++;
           i--;
       }
       return count;
   
       }
   
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("finf the length of last word "));        
    }
}



