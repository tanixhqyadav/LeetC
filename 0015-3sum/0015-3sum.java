import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int op = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = op + nums[left] + nums[right];
                
                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(op, nums[left], nums[right]);
                    set.add(triplet); 
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        
        return new ArrayList<>(set); 
    }
}
