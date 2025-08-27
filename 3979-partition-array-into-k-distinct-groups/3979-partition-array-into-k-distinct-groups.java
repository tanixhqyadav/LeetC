class Solution {
    public boolean partitionArray(int[] nums, int k) {
        //System.out.println(nums.length);
        if(nums.length==k){
            Set<Integer> st=new HashSet<>();
            for(int i=0;i<k;i++){
                st.add(nums[i]);
            }
            return st.size()==k;
        }
       if(nums.length%k!=0){
            return false;
        }
        int x=nums.length/k;
        // // System.out.println(x);
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        // for(int i=0;i<nums.length;i++){
        //     pq.add(nums[i]);
        // }
        // int ans=0;
        // Set<Integer> st=new HashSet<>();
        // while(!pq.isEmpty()){
        //     int c=0;
        //     while( !pq.isEmpty() &&  c!=k){
        //         st.add(pq.remove());
        //         // System.out.println(st);
        //         c++;
        //     }
        //     if(c==k){
        //         ans++;
        //         st.clear();
        //     }
        // }
        // return ans==x;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int t=0;
        for(Integer i:mp.keySet()){
            if(mp.get(i)>x){
                return false;
            }
            t+=mp.get(i);
        }
        System.out.println(mp.size()+" "+t);
        return t%k==0;
    }
}