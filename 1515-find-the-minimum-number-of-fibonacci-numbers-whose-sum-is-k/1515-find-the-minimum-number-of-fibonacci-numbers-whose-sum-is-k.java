class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Long> l=op(k);
        System.out.println(l);
        int c=0;
        int t=0;
        for(int i=l.size()-1;i>=0;i--){
            if(l.get(i)<=k){
                // k-=
                k-=l.get(i);
                if(k<=l.get(i)){
                    i--;
                }
                c++;
            }
            if(k==0){
                break;
            }
        }
        System.out.println(k);
        return c;
    }
    public static List<Long> op(int x){
        List<Long> l=new ArrayList<>();
        l.add(1L);
        l.add(1L);
        for(int i=2;i<=x;i++){
            if(l.get(l.size()-1)>x){
                break;
            }
            l.add(l.get(i-1)+l.get(i-2));
        }
        return l;
    }
}