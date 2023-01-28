class addtwonumbersrepresentedbyll{

    static Node reverse(Node head){
        Node curr=head;
        Node prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node l1=reverse(first);
        Node l2=reverse(second);
        Node dum=new Node(-1);
        Node tail=dum;
        int c=0;
        while(l1!=null || l2!=null){
            int sum=c;
            
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            Node curr=new Node(0);
            curr.data=sum%10;
            c=sum/10;
            tail.next=curr;
            tail=tail.next;
        }
        if(c>0) tail.next=new Node(c);
        return reverse(dum.next);
    
        
    }
}
