public class middleoflinkedlist {
    int getMiddle(Node head)
    {
         // Your code here.
         Node fast=head;
         Node slow=head;
         while(fast!=null&&fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
         }
         return slow.data;
    }
}
