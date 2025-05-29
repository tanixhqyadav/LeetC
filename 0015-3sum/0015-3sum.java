class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int l=nums.length-1;
            while(j<l){
                int s=nums[i]+nums[j]+nums[l];
                if(nums[i]+nums[j]+nums[l]==0){
                    ll.add(Arrays.asList(nums[i],nums[j],nums[l]));
                    while(j<l && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<l && nums[l-1]==nums[l]){
                        l--;
                    }
                    j++;
                    l--;
                }
                else if(s<0){
                    j++;
                }
                else{
                    l--;
                }
            }
        }
        return ll;
    }
}