class reverse{
    Node reverseList(Node head)
    {
        // code here
        Node c=head;
        Node p=null;
        Node n=null;
        while(c!=null)
{
    n=c.next;
    c.next=p;
    p=c;
    c=n;
}        
 
 return p;
 }
}