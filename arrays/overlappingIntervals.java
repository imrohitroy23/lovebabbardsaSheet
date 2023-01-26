public class overlappingIntervals {
        
    public int[][] overlappedInterval(int[][] arr)
    {
        // Code here // Code here
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int res=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[res][1]>=arr[i][0]){
                 arr[res][0]=Math.min(arr[res][0],arr[i][0]);
                 arr[res][1]=Math.max(arr[res][1],arr[i][1]);
                
            }
            else{
                res++;
                arr[res]=arr[i];
                
            }
        }
        int[][] arr2=new int[res+1][2];
        for(int i=0;i<res+1;i++){
            for(int j=0;j<2;j++){
                arr2[i][j]=arr[i][j];
            }
        }
        return arr2;
    }
}
