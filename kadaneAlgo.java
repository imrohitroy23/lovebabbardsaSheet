public class kadaneAlgo {
    long maxSubarraySum(int arr[], int n){
        long sum=0;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(max<sum) max=sum;
        }
        if(sum<0) sum=0;
        // Your code here
        return max;
    }
}
