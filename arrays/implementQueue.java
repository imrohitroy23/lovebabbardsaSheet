public class implementQueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

 
    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
  
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   if(s1.isEmpty()) return -1;
	   while(!s1.isEmpty()){
	       s2.push(s1.pop());
	   }
	   int r=s2.pop();
	   while(s2.isEmpty()==false) s1.push(s2.pop());
	    return r;
    }
}
