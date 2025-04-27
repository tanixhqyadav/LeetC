class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            l.add(i);
        }
        Collections.sort(l,(a,b)-> {
            if(mp.get(a)==mp.get(b)){
                return Integer.compare(b,a);
            }
            return Integer.compare(mp.get(a),mp.get(b));
        }
        );
        int ar[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ar[i]=l.get(i);
        }
        return ar;
    }
}