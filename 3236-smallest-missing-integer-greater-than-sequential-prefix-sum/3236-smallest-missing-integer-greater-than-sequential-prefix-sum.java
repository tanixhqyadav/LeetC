class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1){
            return nums[0]+1;
        }
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int s=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
                s+=nums[i];
            }
            else{
                break;
            }
        }
        while(st.contains(s)){
            s++;
        }
        return s;
    }
}