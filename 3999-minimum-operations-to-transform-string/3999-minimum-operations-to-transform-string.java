class Solution {
    public int minOperations(String s) {
        int  ops=0;
        for(int i=0;i<s.length();i++){
            int d=(26-(s.charAt(i)-'a'))%26;
            ops=Math.max(ops,d);
        }
        return ops;
    }
}

