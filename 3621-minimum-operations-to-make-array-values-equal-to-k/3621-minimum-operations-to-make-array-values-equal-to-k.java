class Solution {
    public int minOperations(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                return -1;
            }
        }
        int c=0;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        for(Integer i: st){
            if(i>k){
                c++;
            }
        }
        return c;
    }
}