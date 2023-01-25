public class firstandlastoccurence {
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
      ArrayList<Long> res=new ArrayList<Long>();
        int f=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                res.add((long)i);
                f++;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                res.add((long)i);
                break;
           
            }
        }
        if(f==0){
            res.add(-1L);
            res.add(-1L);
        }
        return res;
    }
}
