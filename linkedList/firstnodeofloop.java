public class firstnodeofloop {
     //Function to find first node if the linked list has a loop.
     public static int findFirstNode(Node head){
        //code here\
    //     Node f=head;
    //     Node s=head;
    //     Node t=head;
    //     while(f.next!=null && f.next.next!=null ){
    //         f=f.next.next;
    //         s=s.next;
    //         if(s==f){
    //             while(s!=t){
    //                 s=s.next;
    //                 t=t.next;
    //             }
    //         return s.data;
                
    //         }
            
    //     }
    //     return -1;
    // }
    
    HashMap<Node,Integer> set=new HashMap<>();
    while(head!=null)
    {
        if(set.containsKey(head)) return head.data;
        set.put(head,head.data);
        head=head.next;
        
    }
    return -1;
    }
}