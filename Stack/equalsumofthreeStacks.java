package Stack;

public class equalsumofthreeStacks {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int a=0;
        int b=0;
        int c=0;
        for(int i:S1) a+=i;
        for(int i:S2) b+=i;
        for(int i:S3) c+=i;
        int i=0,j=0,k=0;
        while(a>0 && b>0 && c>0){
            if(a==b && b==c) return b;
            else if(a>=b && a>=c) a-=S1[i++];
            else if(b>=a && b>=c) b-=S2[j++];
            else if(c>=a && c>=b) c-=S3[k++];
        }
    return 0;
        
    }
}
