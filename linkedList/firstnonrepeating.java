public class firstnonrepeating {
    public String FirstNonRepeating(String A)
    {
        // code here
        int[] c=new int[26];
        Queue<Character> q = new ArrayDeque<>();
        String ans = "";
        for(int i=0;i<A.length();i++){ c[A.charAt(i)-'a']++;
        q.add(A.charAt(i));
        while(!q.isEmpty()){
            if(c[q.peek()-'a']>1){
                q.remove();
            }
            else{
                ans+=q.peek();
                break;
            }
        }
        if(q.isEmpty()) ans+='#';
    }
    return ans;
}
}
