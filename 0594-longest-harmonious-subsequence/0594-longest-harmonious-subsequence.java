class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        if(mp.size()==1){
            return 0;
        }
        // if(mp.size()==nums.length){
        //     return 2;
        // }
        int ans=0;
        for(Integer i:mp.keySet()){
            int x=i-1;
            if(mp.containsKey(x)){
              ans=Math.max(mp.get(x)+mp.get(i),ans);  
            }
        }
        return ans;

    }
}