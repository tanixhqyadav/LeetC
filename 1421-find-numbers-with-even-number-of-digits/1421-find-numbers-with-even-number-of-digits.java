class Solution {
    static boolean evenva(int n){
        int c=0;
        while(n!=0){
            n/=10;
            c++;
        }
        if(c%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int findNumbers(int[] nums) {
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(evenva(nums[i])){
                z++;
            }
        }
        return z;
    }
}