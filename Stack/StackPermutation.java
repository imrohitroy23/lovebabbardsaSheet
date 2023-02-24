public class StackPermutation {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        int i=0,j=0;
        for(int x:ip){
            ip[i++]=x;
            while(i>0 && ip[i-1]==op[j]){
                i--;j++;
            }
        }
        return i==0?1:0;
        
        
    }
}
