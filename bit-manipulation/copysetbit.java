public class copysetbit {
    static int setSetBit(int x, int y, int l, int r){
        // code here
        if(l<1||r>32) return x;
        for(int i=l;i<=r;i++){
            int mask=1<<(i-1);
            if((y&mask)!=0) x=x|mask;
        }
        return x;
    }
}
