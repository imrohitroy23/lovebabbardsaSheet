public class Isomorphicstring {
    public static boolean areIsomorphic(String s1,String s2)
    {
        // Your code here
         if (s1.length()!=s2.length()) return false;
        
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
       for(Integer i=0;i<s1.length();i++){
           if(m1.put(s1.charAt(i),i)!=m2.put(s2.charAt(i),i)) return false;
       }
       return true;
    }
}
