class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>  l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                l.add(i);
            }
        }
        HashSet st=new HashSet<>();
        for(int i=0;i<l.size();i++){
            int x=l.get(i);
            for(int j=0;j<nums.length;j++){
                if(Math.abs(x-j)<=k){
                    st.add(j);
                }
            }
        }
        List<Integer> ll=new ArrayList<>(st);
        
        Collections.sort(ll);
        // System.out.println(st);
     return ll;   
    }
}