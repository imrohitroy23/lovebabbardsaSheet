public class rectangle {
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        long area=L*B, min=gcd(L,B);
        List<Long> ans=new ArrayList<>();
        ans.add(area/(min*min));
        ans.add(min);
        return ans;
    }
    
    static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
