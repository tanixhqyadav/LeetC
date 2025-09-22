class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int mx=0;
        List<Integer> l=new ArrayList<>(mp.values());
        Collections.sort(l);
        int y=l.get(l.size()-1);
        for(int i=0;i<l.size();i++){
            if(l.get(i)==y){
                mx+=y;
            }
        }
        return mx;
    }
}