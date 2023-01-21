public class palindromme {
    int isPalindrome(String s) {
        // code here
        int l=0;
        int h=s.length()-1;
        while(l<=h){
            if(s.charAt(l)==s.charAt(h)){
                l++;
                h--;
            }
            else{
                break;
            }
        }
        return l>h?1:0;
        
    }
}
