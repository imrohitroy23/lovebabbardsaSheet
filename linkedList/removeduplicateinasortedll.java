public class removeduplicateinasortedll {
    Node removeDuplicates(Node head)
    {
    Node root = head;
    if(head == null){

     return null;

    }
    while(root.next!=null){
      if(root.data == root.next.data){
         root.next = root.next.next;
        }else
     root = root.next;
    }
    return head;
    }
}
}
