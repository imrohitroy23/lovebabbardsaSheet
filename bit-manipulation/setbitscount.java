class setbitcount{
    
    // User function Template for Java

    static int setBits(int n) {
        // code here
        int c=0;
        while(n>0){
            if(n%2==1){
                c++;
            }
            n/=2;
        }
        return c;
    }
}

