public class Celebrity {
    	// code here 
    	Stack<Integer> s=new Stack<>();
    	for(int i=0;i<n;i++) s.push(i);
    	while(s.size()>=2){
    	    int p1=s.pop();
    	    int p2=s.pop();
    	    if(M[p1][p2]==1){
    	        s.push(p2);
    	    }
    	    else{
    	        s.push(p1);
    	    }
    	}
    	int c=s.pop();
    	for(int j=0;j<n;j++){
    	    if(M[c][j]==1) return -1;
            if(M[j][c]==0 && j!=c) return -1;    
    	}
    	return c;
    }
}
