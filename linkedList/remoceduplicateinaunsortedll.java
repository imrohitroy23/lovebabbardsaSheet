public class remoceduplicateinaunsortedll {
    public Node removeDuplicates(Node head) 
    {
       Set<Integer> set = new HashSet<>();
       Node curr=head.next;
       Node prev=head;
       while(curr!=null){
           set.add(prev.data);
           if(set.contains(curr.data)){
               prev.next=curr.next;
           }
           else{
               prev=curr;
           }
           curr=curr.next;
       }
       return head;
    }

}
