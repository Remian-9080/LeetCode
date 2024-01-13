public class Problem_1 {
    public static String mergeAlternately(String word1, String word2)
    {
       int i=0;
       StringBuilder arr=new StringBuilder();
       do
       {
        if(i<word1.length())
        {
            arr.append(word1.charAt(i));
        }
        if(i<word2.length())
        {
            arr.append(word2.charAt(i));
        }
        i++;
       }while(i<word1.length()||i<word2.length());

    return arr.toString();
    }
    
    
}
