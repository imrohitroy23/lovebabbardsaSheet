class validSubstring{
      static int findMaxLen(String s) {
        // code here
        Stack<Integer> st=new Stack<>();
        int max=0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(i);
            else{
                st.pop();
                if(st.size()==0) st.push(i);
                else{
                    int l=i-st.peek();
                    max=Math.max(l,max);
                }
            }
        }
        return max;
    } 
}