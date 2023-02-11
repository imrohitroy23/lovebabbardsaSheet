package Stack;
import java.util.*;


public class Firstnegatiiveintegerinwindowofk {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
    Queue<Long> q = new LinkedList<Long>();
    ArrayList<Long> al = new ArrayList<Long>();

    for (int i = 0; i < K; i++) {
        if (A[i] < 0) {
            q.offer(A[i]);
        }
    }

    for (int i = K; i <= N; i++) {
        if (!q.isEmpty()) {
            al.add(q.peek());
            if (A[i - K] == q.peek()) {
                q.poll();
            }
        } else {
            al.add(0L);
        }

        if (i < N && A[i] < 0) {
            q.offer(A[i]);
        }
    }

    long[] ans = new long[al.size()];
    for (int i = 0; i < al.size(); i++) {
        ans[i] = al.get(i);
    }

    return ans;
    }
}
