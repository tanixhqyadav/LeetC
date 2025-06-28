class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>( (a,b) ->{
            if(mp.get(a)==mp.get(b)){
                return Integer.compare(a,b);
            }else{
                return mp.get(b) - mp.get(a);
            }
            });
        for(Integer i: mp.keySet()){
            if(i%2==0){
                pq.add(i);
            }
        }
        return pq.size()==0 ? -1 : pq.poll();
    }
}