public class indexvaluedarray {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
         ArrayList<Integer> res=new  ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                res.add(i+1);
            }
        }
    
        return res;
    }
}
