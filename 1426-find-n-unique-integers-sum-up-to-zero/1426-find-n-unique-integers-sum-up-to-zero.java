class Solution {
    public int[] sumZero(int n) {
        if(n==1) return new int[]{0};
        List<Integer> l=new ArrayList<>();
        if(n%2==0){
            int i=1;
            n=n/2;
            while(i<=n){
                l.add(i);
                l.add(-i);
                i++;
            }
        }
        else{
            int i=1;
            n=n/2;
            while(i<=n){
                l.add(i);
                l.add(-i);
                i++;
            }
            l.add(0);
        }
        int ans[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}