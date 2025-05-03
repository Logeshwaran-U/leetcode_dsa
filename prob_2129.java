public class prob_2129 {
    public static void capitalizeTitle(String title) {
        
        String nt[] =title.toLowerCase().split(" ");
        StringBuilder op_str = new StringBuilder();
        for(String word :nt)
        {
            if(word.length()>2)
            {
                word = Character.toUpperCase(word.charAt(0))+word.substring(1);
            }
            op_str.append(word).append(" ");
        }
        System.out.println(op_str.toString().trim());
    }
    public static void main(String[] args) {
        capitalizeTitle("this is a new text");
    }
}
