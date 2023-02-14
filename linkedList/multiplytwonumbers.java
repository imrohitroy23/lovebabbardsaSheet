public class multiplytwonumbers {
    long n1=0;
        long n2=0;
        int mod=1000000007;
          while(l1!=null){
              n1=((n1*10)+l1.data)%mod;
              l1=l1.next;
          }
           while(l2!=null){
              n2=((n2*10)+l2.data)%mod;
              l2=l2.next;
          }
          return(n1*n2)%mod;
}
