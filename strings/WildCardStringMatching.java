public class WildCardStringMatching {
    static boolean match(String wild, String pattern)
    {
        // code here
        String s="";
        for(int i=0;i<wild.length();i++){
            if(wild.charAt(i)=='?') s+="[a-z]";
            else if(wild.charAt(i)=='*') s+="([a-z]*)*";
            else s+=wild.charAt(i);
            
            
        }
      
            return java.util.regex.Pattern.matches(s,pattern);
    }
}
