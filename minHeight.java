class minHeight{
    int getMinDiff(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int lar=arr[n-1]-k;
        int smal=arr[0]+k;
        int mn=0;
        int max=0;
        for(int i=0;i<n-1;i++){
            mn=Math.min(smal,arr[i+1]-k);
            max=Math.max(lar,arr[i]+k);
            if(mn<0) continue;
        
        ans=Math.min(ans,(max-mn));
        }
        return ans;
    }
}