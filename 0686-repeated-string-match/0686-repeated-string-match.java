class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder ss=new StringBuilder(a);
        if (ss.toString().contains(b)) return 1;
        int c=1;
        while(ss.length()<b.length()){
            ss.append(a);
            c++;
            System.out.println(c);
            if(ss.toString().contains(b)) return c;
        }
        ss.append(a);
        c++;
        if(ss.toString().contains(b)) return c;
        return -1;
    }
}