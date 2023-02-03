package trie;
import java.util.*;
public class PhoneDirectory {
    static void displayContacts(int n, String contact[], String s){
    ArrayList<ArrayList<String>> res=new ArrayList<ArrayList<String>>();
    String pre="";
    for(char ch:s.toCharArray()){
    pre+=ch;
    HashSet<String> set=new HashSet<>();
    for(String str:contact){
        if(str.startsWith(pre)){
            set.add(str);
        }
    }
    if(set.isEmpty())
        set.add("0");
    
    ArrayList<String> list=new ArrayList<>(set);
    Collections.sort(list);
    res.add(list);
  
}
  System.out.println(res);
}


public static void main(String[] args) {
    String[]  co={"geeikistest", "geeksforgeeks","geeksfortest"};
    int n=co.length;
    String s="geeips";
    PhoneDirectory.displayContacts(n, co, s);
}

}