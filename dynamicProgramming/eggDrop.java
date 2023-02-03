public class eggDrop {
   
        static int solve(int n,int k,int dp[][])
           {
               if(k==0||k==1)
               {
                   return k;
               }
               if(n==1)
               {
                   return k;
               }
               if(dp[n][k]!=0)
               {
                   return dp[n][k];
               }
               int min=Integer.MAX_VALUE;
               for(int f=1;f<=k;f++)
               {
                   int temp=1+Math.max(solve(n-1,f-1,dp),solve(n,k-f,dp));
                   min=Math.min(min,temp);
               }
               return dp[n][k]=min;
           }
           static int eggDrop(int n, int k) 
           {
               // Your code here
               int dp[][]=new int[n+1][k+1];
               return solve(n,k,dp);
           }
       }
