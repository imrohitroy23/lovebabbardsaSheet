//Given binary string str of length N. The task is to find the maximum count of consecutive substrings str can be divided into such that all the substrings are balanced i.e. they have an equal number of 0s and 1s. If it is not possible to split str satisfying the conditions then return -1.

public class splitintoonesandzeros {
    public static int maxSubStr(String str) {
        //Write your code here
        int c=0;
        int z=0;
        int o=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0') z++;
            else
            o++;
        
        if(z==o){
            z=0;
            o=0;
            c++;
        }
     }
     
     if(z!=o) return -1;
     if(c==0) return -1;
     return c;
     }
}
