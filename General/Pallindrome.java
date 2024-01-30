public class Pallindrome {
    public boolean isPalindrome(String s) 
    {
       
       StringBuilder arr=new StringBuilder();
    
       for(char ch : s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            arr.append(Character.toLowerCase(ch));
        }
    }
    if(arr.toString().equals(arr.reverse().toString())){
    return true;
    }
    return false;
}
}

