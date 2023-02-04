public class parenthesis {
    static boolean ispar(String x){
    Stack<Character> s=new Stack<>();
    for(int i=0;i<x.length();i++){
        if(isOpening(x.charAt(i))){
            s.push(x.charAt(i));
        }
        else{
            if(s.isEmpty()){
                return false;
            }
            else if(!isMatching(s.peek(),x.charAt(i))){
                return false;
            }
            else{
                s.pop();
            }
            
        }
    }
    return s.isEmpty();
}
    
    

 public static boolean isMatching(char a , char b){
    return a=='[' && b==']' || a=='{' && b=='}' || a=='(' && b==')' || a=='"' && b== '"';
}
public static boolean isOpening(char a){
 return a=='{' || a=='[' || a=='"' || a=='(';   
}
}

