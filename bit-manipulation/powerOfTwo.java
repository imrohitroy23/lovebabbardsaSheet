public class powerOfTwo {
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n==0) return false;
        while(n!=1){
            if(n%2!=0) return false;
            n/=2;
        }
        return true;
        
    }
}
