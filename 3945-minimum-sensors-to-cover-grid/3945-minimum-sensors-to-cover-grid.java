class Solution {
    public int minSensors(int n, int m, int k) {
        int s=2*k+1;
        System.out.print(Math.ceil(n/s) +" "+ Math.ceil(m/s)+" "+s);
        return (int) ((Math.ceil((double)n/s))*(Math.ceil((double)m/s)));
    }
}