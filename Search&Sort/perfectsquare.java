public class perfectsquare {
    static int countSquares(int N) {
        // code here
        int c=0;
        for(int i=1;i<N;i++){
            if(i*i<N){
                c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}
