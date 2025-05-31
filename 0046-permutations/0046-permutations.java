class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        pr(nums,ll,l,0);
        return ll;
    }
    public static void pr(int nums[],List<List<Integer>> ll,List<Integer> l,int pl){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(l.contains(nums[i])){
                continue;
            }
            l.add(nums[i]);
            pr(nums,ll,l,i);
            l.remove(l.size()-1);
        }
    }
}