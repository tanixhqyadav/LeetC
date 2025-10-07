class Solution {
    public int longestSubsequence(int[] ar) {
        int n=ar.length;
        int xp=0;
        for (int i=0; i<n; i++) {
            xp^=ar[i];
        }

        if (xp!=0) {
            return n;
        }

        int[] prfX=new int[n];
        prfX[0]=ar[0];
        for (int i=1; i<n; i++) {
            prfX[i]=prfX[i-1]^ar[i];
        }
        
        int frX=-1;
        for (int i=0; i<n; i++) {
            if (prfX[i]==0) {
                frX=i;
                break;
            }
        }

        int laX=-1;
        for (int i=n-1; i>=0; i--) {
            if (prfX[i]==0) {
                laX=i;
                break;
            }
        }
        
        boolean allZeros = true;
        for(int x : ar) {
            if (x != 0) {
                allZeros = false;
                break;
            }
        }
        if (allZeros) {
            return 0;
        }

        int len1=n-(frX+1);
        int len2=laX;

        return Math.max(len1, len2);
    }
}