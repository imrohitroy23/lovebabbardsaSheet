public class minimumcosttoropes {
    long minCost(long arr[], int n) 
    {
        // your code here
         PriorityQueue<Long> pq = new PriorityQueue<>();
         for(long x:arr) pq.add(x);
         long res=0;
         while(pq.size()>1){
             long p1=pq.poll();
             long p2=pq.poll();
             res+=(p1+p2);
             pq.add(p1+p2);
         }
         return res;
    }
}
