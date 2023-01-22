class spiralform{
     static ArrayList<Integer> spirallyTraverse(int m[][], int r, int c1)
    {
        // code here 
        int rowst=0;
        int colst=0;
        int colend=m[0].length-1;
        int re=m.length-1;
        int t=r*c1;
        int c=0;
        ArrayList<Integer>list=new ArrayList<Integer>();
        while(t>c){
            for(int i=colst;i<=colend && c<t;i++){
                list.add(m[rowst][i]);
                c++;
            }
            rowst++;
            for(int i=rowst;i<=re && c<t;i++){
                list.add(m[i][colend]);
                c++;
            }
            colend--;
            
            for(int i=colend;i>=colst && c<t;i--){
                list.add(m[re][i]);
                c++;
            }
            re--;
            for(int i=re;i>=rowst && c<t;i--){
                list.add(m[i][colst]);
                c++;
            }    
            
            colst++;
        }
        return list;
    }
}