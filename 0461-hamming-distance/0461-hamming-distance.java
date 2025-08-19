class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int c=0;
        while(xor>0) {
            xor=xor&(xor-1);   
            c++;
        }
        return c;

    }
}