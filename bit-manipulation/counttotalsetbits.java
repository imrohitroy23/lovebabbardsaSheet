public class counttotalsetbits {
        //Function to return sum of count of set bits in the integers from 1 to n.
        public static int countSetBits(int n){
            if(n<=0){
                return 0;
            }
     
            int x = (int)(Math.log(n)/Math.log(2));
            int a = (int)Math.pow(2,x);
            
            return a/2*x + (n-a+1) + countSetBits(n-a);
        }
}
