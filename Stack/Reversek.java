public class Reversek {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        if(q.size()==0) return q;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.peek());
            q.remove();
            
        }
     
        while(!st.empty()) q.add(st.pop());
        int n=q.size();
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}
