public class LargestNumberinKSwaps {
    static void swap(char a[],int i,int j){
        char t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    static String max="";
    public static String findMaximumNum(String str, int k)
        {
        char arr[]=str.toCharArray();
        max=str;
        int n=arr.length;
        helper(0,k,arr,n);
        return max;
        }
    static void helper(int swapcount,int k,char arr[],int n){
        if(swapcount==k) return;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    swap(arr,i,j);
                    if(String.valueOf(arr).compareTo(max)>0)
                    max=String.valueOf(arr);
                    
                    helper(swapcount+1,k,arr,n);
                    swap(arr,j,i);
                }
            }
        }
    }
}
