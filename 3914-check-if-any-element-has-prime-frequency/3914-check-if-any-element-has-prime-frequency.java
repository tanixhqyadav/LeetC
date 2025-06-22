class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Integer i:mp.values()){
            if(prime(i)){
                return true;
            }
        }
        return false;
    }
    public static boolean prime(int k){
        if(k==1) return false;
        for(int i=2;i<=(int)Math.sqrt(k);i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
}