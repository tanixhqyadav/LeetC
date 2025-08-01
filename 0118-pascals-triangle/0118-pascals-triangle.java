
class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ll=new ArrayList<>();
        ll.add(Arrays.asList(1));
        if(num==1){
            return ll;
        }
        ll.add(Arrays.asList(1,1));
        if(num==2){
            return ll;
        }
        for(int i=3;i<=num;i++){
            List<Integer> l= new ArrayList<>();
            l.add(1);
            List<Integer> op=ll.get(ll.size()-1);
            int s=0;
            for(int j=0;j<op.size()-1;j++){
                s=op.get(j)+op.get(j+1);
                l.add(s);
                s=0;
            }
            l.add(1);
            ll.add(l);
        }
        return ll;
    }

    // public static long fact(int n) {
    //     long p = 1;
    //     for (int i = 1; i <= n; i++) {
    //         p *= i;
    //     }
    //     return p;
    // }

    // public static long com(int f, int r) {
    //     return fact(f) / (fact(f - r) * fact(r));
    // }
}
