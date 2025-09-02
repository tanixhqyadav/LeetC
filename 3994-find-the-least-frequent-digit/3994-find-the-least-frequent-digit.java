class Solution {
    public int getLeastFrequentDigit(int n) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        while(n!=0){
            int x=n%10;
            System.out.println(x);
            mp.put(x,mp.getOrDefault(x,0)+1);
            n/=10;
        } 
        // if(mp.containsKey(0)){
        //     mp.remove(0);
        // }
        int c=Integer.MAX_VALUE;
        int ans=10;
        for(Integer i:mp.keySet()){
            if(mp.get(i)<c){
                c=mp.get(i);
                ans=i;
            }else if(c==mp.get(i)){
                ans=Math.min(i,ans);
            }
        }
        return ans;
    }
}