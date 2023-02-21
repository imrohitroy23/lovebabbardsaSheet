public class maxAreaHisto {
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long maxArea = 0;
        long[] nsl = new long[hist.length];
        long[] nsr = new long[hist.length];
        Stack<Integer> s=new Stack<>();
        for(int i=hist.length-1;i>=0;i--){
            while(!s.isEmpty() && hist[s.peek()]>=hist[i]) s.pop();
            if(s.isEmpty()) nsr[i]=hist.length;
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=0;i<hist.length;i++){
            while(!s.isEmpty() && hist[s.peek()]>=hist[i]) s.pop();
            if(s.isEmpty()) nsl[i]=-1;
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<hist.length;i++){
            long h=hist[i];
            long w=nsr[i]-nsl[i]-1;
            long cu=h*w;
            maxArea=Math.max(cu,maxArea);
        }
        return maxArea;
    }
}
