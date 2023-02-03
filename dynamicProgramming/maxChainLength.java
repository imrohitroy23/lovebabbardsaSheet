class maxChainLength{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       Arrays.sort(arr,(a,b)->a.y-b.y);
       int max=0;
       int min=-1;
       for(int i=0;i<n;i++){
           Pair curr=arr[i];
           if(curr.x>min){
               max++;
               min=curr.y;
           }
       }
       return max;
    }
}