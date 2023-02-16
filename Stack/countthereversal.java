
public class countthereversal {
    int countRev (String s)
    {
    if(s.length()%2!=0){
        return -1;
    }
    int count=0;
    stack<char> st;
    int n1=0,n2=0;
    for(int i=0;i<s.length();i++){
        if(s[i]=='{'){
            st.push(s[i]);
            n1++;
        }
        else if(!st.empty() && s[i]=='}'){
            st.pop();
            n1--;
        }
        else{
            n2++;
        }
    }
    count=ceil(n1/2.0)+ceil(n2/2.0);
    return count;
    }
}
