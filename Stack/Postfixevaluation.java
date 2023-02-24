public class Postfixevaluation {
    public static int evaluatePostFix(String s)
    {
        // Your code here
         Stack <Integer> st= new Stack<Integer>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char q=s.charAt(i);
            if(Character.isDigit(s.charAt(i))){
                st.push(q-'0');
                
            }
            else{
                int v1=st.pop();
                int v2=st.pop();
                switch(q){
                    case '+':
                        st.push(v1+v2);
                        break;
                    case '-':
                        st.push(v2-v1);
                        break;
                    case '*':
                        st.push(v2*v1);
                        break;
                    case '/':
                        st.push(v2/v1);
                        break;
                   
                }
                
            }
        }
        return st.pop();
    }
}
