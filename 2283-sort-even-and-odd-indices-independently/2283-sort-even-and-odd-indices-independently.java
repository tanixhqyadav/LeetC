class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> odl=new ArrayList<>();
        ArrayList<Integer> evl=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==1){
                odl.add(nums[i]);
            }
            else{
                evl.add(nums[i]);
            }
        }
        Collections.sort(odl,Collections.reverseOrder());
        Collections.sort(evl);
        int x=0,y=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=evl.get(x);
                x++;
            }
            else{
                nums[i]=odl.get(y);
                y++;
            }
        }
        return nums;
    }
}