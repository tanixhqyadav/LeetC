class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        boolean tr[]=new boolean[nums.length];
        Arrays.sort(nums);
        opl(ll,nums,l,tr,0);
        return ll;
    }
    public static void  opl(List<List<Integer>> ll,int nums[],List<Integer> l,boolean tr[],int pl){

        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(tr[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !tr[i-1]) continue;
            tr[i]=true;
            l.add(nums[i]);
            opl(ll,nums,l,tr,i);
            l.remove(l.size()-1);
            tr[i]=false;
        }
    }
}