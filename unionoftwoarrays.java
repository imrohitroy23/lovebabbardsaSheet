import java.util.HashSet;
import java.util.Set;

public class unionoftwoarrays {
    



    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> set=new HashSet<>();
         for(int i=0;i<m;i++){
            set.add(b[i]);
        }
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        return set.size();
    }
}