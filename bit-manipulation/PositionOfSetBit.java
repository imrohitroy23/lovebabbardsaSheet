public class PositionOfSetBit {
    static int findPosition(int N) {
        String s=Integer.toBinaryString(N);
        int c=0;
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        int r=0;
        for(int i=0;i<n;i++)
        {
            
            if(sb.charAt(i)=='1')
            {
                c++;
                r=i;
            }
        }
        if(c>1||c==0) {
            
            return -1;
        }
        return r+1;
    }
}
