public class SpecialStack {
    public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(!s.isEmpty()) return s.pop();
            return -1;
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int min=s.peek();
           while(!s.isEmpty()) {
               if(s.peek()<min) min=s.peek();
               s.pop();
           }
           
           return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n) return true;
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.isEmpty()) return true;
           return false;
	}
}
