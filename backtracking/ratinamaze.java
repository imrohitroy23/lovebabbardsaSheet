class ratinamaze{
     public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> s1=new ArrayList<>();
        move(m,n,0,0,"",s1);
        // Your code here
        if(s1.size()==0) 
        s1.add("-1");
        return s1;
    }
    
    public static void move(int[][]m,int n, int r , int c, String s, ArrayList<String> s1){
        if(r==n-1 && c==n-1 && m[r][c]==1){
            s1.add(s);
            return;
        }
        if(r>=0 && c>=0 && r<n && c<n && m[r][c]==1 ){
            m[r][c]=0;
            move(m,n,r+1,c,s+"D",s1);
            move(m,n,r,c+1,s+"R",s1);
            move(m,n,r-1,c,s+"U",s1);
            move(m,n,r,c-1,s+"L",s1);
            m[r][c]=1;
        }
    }

}