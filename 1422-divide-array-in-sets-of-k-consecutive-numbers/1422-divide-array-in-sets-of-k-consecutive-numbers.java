class Solution {
    public boolean isPossibleDivide(int[] a, int k) {
        // if(nums.length%k!=0 || nums.length==k){
        //     return false;
        // }
        // int x=nums.length/k;
        // System.out.println(x);
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
        //         System.out.println(st);
        //         c++;
        //     }
        //     if(c==k){
        //         ans++;
        //         st.clear();
        //     }
        // }
        // return ans==x;
        if (a.length % k != 0){
            return false;
        } 
        TreeMap<Integer,Integer> m=new TreeMap<>();
        for (int i=0;i<a.length;i++){ 
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }
        for (int x:m.keySet()) {
            int c=m.get(x);
            if (c>0) {
                for (int i=0;i<k;i++) {
                    int y=x+i;
                    if (m.getOrDefault(y,0)<c){
                        return false;
                    }
                    m.put(y,m.get(y)-c);
                }
            }
        }
        return true;
    }
}