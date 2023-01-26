class median{
    public int find_median(int[] v)
    {
        Arrays.sort(v);
        if(v.length%2!=0)
            return v[v.length/2];
        else
            return (v[v.length/2 -1] + v[v.length/2]) /2;
    }
}