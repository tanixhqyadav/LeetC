import java.util.*;

class Solution {
    public int minOperations(int[][] arr,int x) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<arr.length;i++) 
            for(int j=0;j<arr[i].length;j++) 
                l.add(arr[i][j]);

        Collections.sort(l);
        int xl=l.get(l.size()/2);
        return medmin(l,x,xl);
    }

    public static int medmin(List<Integer>l,int x,int s) {
        int ans=0;
        for(int num:l) {
            int op=Math.abs(num-s);
            if(op%x!=0) return -1;
            ans+=op/x;
        }
        return ans;
    }
}
