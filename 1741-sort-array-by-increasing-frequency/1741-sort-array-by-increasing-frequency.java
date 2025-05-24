class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        Collections.sort(l,(a,b)->{
            if(mp.get(a).equals(mp.get(b))){
                return Integer.compare(b,a);
            }
            return Integer.compare(mp.get(a),mp.get(b));
        });
        int y[]=new int[l.size()];
        for(int i=0;i<nums.length;i++){
            y[i]=l.get(i);
        }
        return y;
    }
}