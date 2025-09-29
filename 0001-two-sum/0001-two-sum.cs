public class Solution {
    public int[] TwoSum(int[] nums, int t) {
        Dictionary<int, int> mp=new Dictionary<int, int>();
        for(int i=0;i<nums.Length;i++){
            mp[nums[i]]=i;
        }
        int[] ar=new int[2];
        for(int i=0;i<nums.Length;i++){
            if(mp.ContainsKey(t-nums[i]) && i!=mp[t-nums[i]]){
                ar[0]=i;
                ar[1]=mp[t-nums[i]];
                // break;
            }
        }
        return ar;
    }
}