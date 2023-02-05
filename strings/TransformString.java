public class TransformString {
    
    int transform (String A, String B)
    {
        // code here
        int n=A.length();
        int m=B.length();
        if(n!=m) return -1;
        int c=0;
        char[] ca=A.toCharArray();
        char[] cb=B.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        if(!String.valueOf(ca).equals(String.valueOf(cb))) return -1;
       for(int i=A.length()-1,j=B.length()-1;i>=0;i--){
            if(A.charAt(i)==B.charAt(j))
                j--;
            else{
                c++;
            }
        }
        return c;
    }
}
