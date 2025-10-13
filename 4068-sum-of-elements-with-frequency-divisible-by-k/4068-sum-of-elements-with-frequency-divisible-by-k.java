class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int s=0;
        for(Integer i:mp.keySet()){
            if(mp.get(i)%k==0){
                int x=mp.get(i);
                while(x!=0){
                    s+=i;
                    x--;
                }
            }
        }
        return s;
    }
}