public class mergeknodes {
    Node mergeKList(Node[]arr,int K)
    {
        PriorityQueue<Node> pq = new PriorityQueue<>((i1, i2) -> (i1.data-i2.data));
        for(int i = 0;i<K;i++){
            pq.add(arr[i]);
        }
        Node res=new Node(0);
        Node t=res;
        while(!pq.isEmpty()){
            Node tt=pq.poll();
            t.next=tt;
            t=tt;
            if(tt.next!=null){
                pq.add(tt.next);
            }
            
        }
        return res.next;
    }
}
