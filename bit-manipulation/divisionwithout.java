public class divisionwithout {
    public static long divide(long a, long b)
    {
       int sign = (a<0)^(b<0) ? -1:1;
        
        long temp = 0;
        long quotient = 0;
        long dividend = Math.abs(a);
        long divisor = Math.abs(b);
         for(int i=31;i>=0;i--) {
            if(temp + (divisor<<i) <= dividend) {
                temp+=(divisor<<i);
                quotient+=1<<i;
            }
        }
     
        
        return sign*quotient;
    }
}
