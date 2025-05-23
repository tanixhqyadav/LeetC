class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            int c=1;
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                l.add(c);
                c=c*(i-j)/(j+1);
            }
            ll.add(l);
        }
        System.out.println(ll);
        return ll;
    }
}