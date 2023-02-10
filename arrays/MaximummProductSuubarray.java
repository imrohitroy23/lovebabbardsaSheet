public class MaximummProductSuubarray {
    long maxProduct(int[] arr, int n) {
        // code here
        long curr=1;
        long ans=arr[0];
        for(int i=0;i<n;i++){
            curr*=arr[i];
            ans=Math.max(ans,curr);
            if(curr==0) curr=1;
        }
        curr=1;
        for(int i=n-1;i>=0;i--){
            curr*=arr[i];
            ans=Math.max(ans,curr);
            if(curr==0) curr=1;
        }
        return ans;
        
    }
}
