class Solution {
    public int[] maxSubsequence(int[] ar, int k) {
        int[][] p = new int[ar.length][2];
        for (int i=0; i<ar.length; i++) {
            p[i][0]=ar[i];
            p[i][1]=i;
        }

        Arrays.sort(p, (a,b) -> b[0]-a[0]);
        int[][] top=Arrays.copyOf(p, k);
        Arrays.sort(top,(a,b)->a[1]-b[1]);
        int[] ans = new int[k];
        for (int i=0; i<k; i++){
            ans[i]=top[i][0];
        }

        return ans;
    }
}
