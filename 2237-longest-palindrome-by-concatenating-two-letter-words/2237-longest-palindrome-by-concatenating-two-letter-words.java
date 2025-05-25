class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> mp=new HashMap<>();
        for (String w :words) {
            mp.put(w,mp.getOrDefault(w, 0)+1);
        }

        int len=0;
        boolean lp=false;

        for (String s : mp.keySet()) {
            String rev=rev(s);
            int c=mp.get(s);

            if(s.equals(rev)){
                len+=(c/2)*4;
                if (c%2==1) {
                    lp=true;
                }
            }else if(mp.containsKey(rev)){
                int revc=mp.get(rev);
                int pa=Math.min(c, revc);
                len+=pa*4;
                mp.put(s, 0);
                mp.put(rev, 0);
            }
        }
        if(lp){
            len+=2;
        }
        return len;
    }

    public static String rev(String s) {
        char[] op=s.toCharArray();
        int i=0, j=op.length-1;
        while (i<j) {
            char t=op[i];
            op[i]=op[j];
            op[j]=t;
            i++;
            j--;
        }
        return new String(op);
    }
}
