class Solution {
    public int[] executeInstructions(int n, int[] sp, String s) {
        // int ar[][]=new int[n][n];
        int p[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int x=simu(n,sp,s.substring(i));
            p[i]=x;
        }
        // System.out.println(s.substring(x));
        return p;
    }
    public static int simu(int n, int sp[], String s){
        int c=0;
        int p1=sp[0];
        int p2=sp[1];
        for(int x=0;x<s.length();x++){
            char t=s.charAt(x);
            if (t=='R') p2++;
            else if (t=='L') p2--;
            else if (t=='U') p1--;
            else if (t=='D') p1++;
            if (p1<0 || p2<0 || p1>= n || p2>=n){
                 break;
            }
            c++;
        }
        return c;
        }
    }