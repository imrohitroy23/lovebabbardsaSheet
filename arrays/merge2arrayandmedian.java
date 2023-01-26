public class merge2arrayandmedian {
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
             ArrayList<Integer>s=new ArrayList<Integer>();

        for(int i=0;i<n;i++)

        s.add(a[i]);

        for(int i=0;i<m;i++)

        s.add(b[i]);

        Collections.sort(s);

        int size=s.size();

        int mid=size/2;

        if((size%2)!=0)

        {

           double h=s.get(mid); 

           return h;

        }

        double ans=s.get(mid)+s.get(mid-1);

        return ans/2; 
    }
}
}
