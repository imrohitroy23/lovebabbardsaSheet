public class max-mineleinarray {
    

    public static int findSum(int A[],int n) 
    {
        //code here
        Arrays.sort(A);
        int a1=A[0];
        int b=A[n-1];
        return (b+a1);
    }
}