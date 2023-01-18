public class kthmaxminele {
    static int c(int [] nums, int mid)
    {
          
              int cnt = 0;
                
              for(int i = 0; i < nums.length; i++)
                if(nums[i] <= mid)
                    cnt++;
                
              return cnt;
              }
      public static int kthSmallest(int[] arr, int l, int h, int k) 
      { 
          //Your code here
         for(int i=0;i<arr.length;i++){
             l=Math.min(l,arr[i]);
             h=Math.max(h,arr[i]);
         }
         while(l<h){
             int mid=(l+h)/2;
             if(c(arr,mid)<k){
                 l=mid+1;
             }
             else{
                 h=mid;
             }
         }
         return l;
      } 
}
//we can use this too
// public static int kthSmallest(int[] arr, int l, int r, int k) 
// { 
//     //Your code here
//     Arrays.sort(arr);
//     return arr[l+k-1];
    
// } 