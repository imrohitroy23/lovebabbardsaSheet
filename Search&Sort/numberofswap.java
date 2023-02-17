public class numberofswap {
    public int minSwaps(int nums[])
    {
        int[] copy=nums.clone();
        int n=nums.length;
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
       
        for (int i = 0; i < n; i++)
           map.put(nums[i], i);
       
        Arrays.sort(copy);
        for(int i=0;i<n;i++){
            if(nums[i]!=copy[i]){
                int ind=map.get(copy[i]);
                map.put(nums[i],ind);
                swap(ind,i,nums)  ;
                ans++;
            }
        }
        return ans;
    }

    public void swap(int i,int j,int[] arr){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    
}
