class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ll=new ArrayList<>();
        for(int i=0;i<=n-4;i++){
            // List<Integer> le=new ArrayList<>();
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<=n-3;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int l=j+1;
                int r=nums.length-1;
                while(l<r){
                    long s= 1L * nums[i]+nums[j]+nums[l]+nums[r];
                    if(s==t){
                        ll.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while(l<r && nums[l]==nums[l+1]){l++;}
                        while(l<r && nums[r]==nums[r-1]){r--;}
                        l++;
                        r--;
                    }
                    else if(s<t){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
            // ll.add(l);
        }
        System.out.println(ll);
        return ll;
    }
}