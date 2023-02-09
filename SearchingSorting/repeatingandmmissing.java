package SearchingSorting;

public class repeatingandmmissing {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int count[]=new int[n+1];
        int res[]=new int[2];
        for(int i=0 ; i<n ; i++)
        {
            count[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]>1) res[0]=i;
            if(count[i]==0) res[1]=i;
        }
    
    return res;
    }
}
