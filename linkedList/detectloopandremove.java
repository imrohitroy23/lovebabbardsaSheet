public class detectloopandremove {
    {
        //procedure1
        // public static void removeLoop(Node head)
        // {
        //     Node slow=head;
        //     Node fast=head;
        //     Node prev=head;
        //     while(fast!=null && fast.next!=null)
        //     {
        //         prev=slow;
        //         slow=slow.next;
        //         fast=fast.next.next;
        //         if(slow==fast)
        //         {
        //             break;
        //         }
        //     }
        //     if(slow==fast)
        //     {
        //         fast=head;
            
        //     while(slow!=fast)
        //     {
        //         prev=slow;
        //         slow=slow.next;
        //         fast=fast.next;
        //     }
        //     prev.next=null;
        //     }
        // }
        
         public static void removeLoop(Node head){
             Set<Node> set=new  HashSet<>();
             Node curr=head;
             Node prev=head;
             while(curr!=null){
                 if(set.contains(curr)){
                     prev.next=null;
                     return;
                 }
                 set.add(curr);
                 prev=curr;
                 curr=curr.next;
             }
             
             
         }        
    }
}
