class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<nums.size();i++){
            mp.put(nums.get(i),mp.getOrDefault(nums.get(i),0)+1);
        }
        int x=0;int f=0;
        for(Integer i: mp.keySet()){
            if(mp.get(i)>f){
                f=mp.get(i);
                x=i;
            }
        }
        int i=0;
        int c=0;
        int ans=-1;
        while(i<nums.size()){
            if(nums.get(i)==x){
                c++;
            }
            if (c*2>(i+1) && (f-c)*2>(nums.size()-(i + 1))) {
                ans = i;
                break;
            }
            i++;
        }
        return ans;

        // x=mp.get(f);

    }
}