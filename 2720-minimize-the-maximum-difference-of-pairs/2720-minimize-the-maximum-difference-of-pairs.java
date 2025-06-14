class Solution {
    public int minimizeMax(int[] nums,int p){
        Arrays.sort(nums);
        int i=0;
        int j=nums[nums.length-1]-nums[0];
        int op=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(op(nums,mid,p)){
                op=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return op;
    }
    // a bit of complex needed hints but a good variation BS question 
    public static  boolean op(int[] nums,int l,int p){
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=l){
                k++;
                i++;
            }
        }
        return k>=p;
    }
}
