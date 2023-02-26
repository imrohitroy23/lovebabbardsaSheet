public class coinchange {
    public long count(int coins[], int n, int sum) {
        // code here.
        long[] dp=new long[sum+1];
        for(int i=0;i<sum+1;i++) dp[i]=0;
        dp[0]=1;
        for(int i=0;i<n;i++){
        for(int j=coins[i];j<=sum;j++){
            dp[j]+=dp[j-coins[i]];
        }
    }
    return dp[sum];
    }
}
