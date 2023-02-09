package SearchingSorting;

public class majority {
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < size; i++) {
            if (map.get(a[i]) > size / 2) return a[i];
        }
        return -1;
    }
}
