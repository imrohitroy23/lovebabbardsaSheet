import java.util.*;
public class longestSusequence {
    public static void main(String[] args) {
        int[] arr={10, 9, 4, 5, 4, 8, 6};
        int n=arr.length;
   longestSubsequence(n, arr);
    }
    static void longestSubsequence(int n, int arr[])
    {
        // code here
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++)

        dp[0]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(Math.abs(arr[i]-arr[j])==1){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            System.out.println(dp[i]);
            max=Math.max(max,dp[i]);
        }
       System.out.println("mmax"+max);
    }
}
