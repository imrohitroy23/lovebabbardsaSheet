public class Palindrome {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        // code here
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        gettingPermu(0,ans,ds,S);
        return ans;
    }
   static void gettingPermu(int ind,ArrayList<ArrayList<String>> ans,List<String> ds,String s){
        if(ind==s.length())
       {
           ans.add(new ArrayList<>(ds));
           return;
       }
       for(int i=ind;i<s.length();i++)
       {
           if(checkPalin(s,ind,i))
           {
               ds.add(s.substring(ind,i+1));
               gettingPermu(i+1,ans,ds,s);
               ds.remove(ds.size()-1);
           }
       }
   }
    public static boolean checkPalin(String s,int st,int end)
   {
       while(st<=end)
       {
           if(s.charAt(st++)!=s.charAt(end--))
           return false;
       }
       return true;
    }
}
