public class OptimmalSttrategy {
    static long countMaximum(int arr[], int n)
    {
        // Your code here
        long[][] dp=new long[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return solve(0,n-1,arr,dp);
    }
    static long solve(int i,int j,int arr[],long[][] dp){
        if(i>j) return 0;
        if(i==j) return arr[i];
        if(dp[i][j]!=-1) return dp[i][j];
        long x= arr[i]+ Math.min( solve(i+2,j,arr,dp), solve(i+1,j-1,arr,dp));
        long y= arr[j]+ Math.min( solve(i+1,j-1,arr,dp), solve(i,j-2,arr,dp));
        return dp[i][j]= Math.max(x, y);
    }
}
