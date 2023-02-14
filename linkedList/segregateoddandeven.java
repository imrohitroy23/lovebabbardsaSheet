public class segregateoddandeven {
    Node divide(int N, Node head){
        ArrayList<Integer> a = new ArrayList<>();
        Node cur = head;
        while(cur!=null){
            if(cur.data%2==0){
                a.add(cur.data);
                
            }
            cur=cur.next;
            
        }
        cur=head;
          while(cur!=null){
            if(cur.data%2!=0){
                a.add(cur.data);
                
            }
            cur=cur.next;
            
        }
        cur=head;
        for(int i=0;i<a.size();i++){
            cur.data=a.get(i);
            cur=cur.next;
        }
        return head;
        
    }
}
