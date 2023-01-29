class nmeetin1room{
    class Solution 
{
    private static class Pair{
        int start;
        int end;
        Pair(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int s[], int f[], int n)
    {
        // add your code here4
        Pair []p=new  Pair[n];
        for(int i=0;i<n;i++){
            p[i]=new Pair(s[i],f[i]);
        }
        Arrays.sort(p,(a,b)->a.end-b.end);
        int pre=0;
        int ans=1;
        for(int i=1;i<n;i++){
            if(p[i].start>p[pre].end){
                ans++;
                pre=i;
            }
        }
        return ans;
    }
}
}