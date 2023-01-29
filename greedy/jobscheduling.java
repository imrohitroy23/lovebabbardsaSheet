public class jobscheduling {
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (a,b) -> b.profit - a.profit);
        
        int[] temp = new int[n+1];
        Arrays.fill(temp, -1);
        
        for(int i=0;i<n;i++) {
            Job curr_j = arr[i];
            
            while(curr_j.deadline != -1) {
                if(temp[curr_j.deadline] == -1) {
                    temp[curr_j.deadline] = curr_j.profit;
                    break;
                }
                
                curr_j.deadline--;
            }
        }
        int job_profit = 0;
        int count = 0;
        for(int i=1;i<n+1;i++) {
            if(temp[i] != -1) {
                count++;
                job_profit += temp[i];
            }
        }
        
        return new int[]{count, job_profit};
        
    }
}


/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
}
