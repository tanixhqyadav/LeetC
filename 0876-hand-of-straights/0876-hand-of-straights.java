class Solution {
    public boolean isNStraightHand(int[] a, int k) {
        if (a.length % k != 0){
            return false;
        } 
        TreeMap<Integer,Integer> m=new TreeMap<>();
        for (int i=0;i<a.length;i++){ 
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }
        for (int x:m.keySet()) {
            int c=m.get(x);
            if (c>0) {
                for (int i=0;i<k;i++) {
                    int y=x+i;
                    if (m.getOrDefault(y,0)<c){
                        return false;
                    }
                    m.put(y,m.get(y)-c);
                }
            }
        }
        return true;

    }
}