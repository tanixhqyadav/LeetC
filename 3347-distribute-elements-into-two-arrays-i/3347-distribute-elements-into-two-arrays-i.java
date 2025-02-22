class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        int x=0;
        int y=0;
        for(int i=2;i<nums.length;i++){
            if(l1.get(x)>l2.get(y)){
                l1.add(nums[i]);
                x++;
            }else{
                l2.add(nums[i]);
                y++;
            }
        }
        int ar[]=new int[nums.length];
        int op=0;
        for(int i=0;i<l1.size();i++){
            ar[i]=l1.get(op);
            op++;
        }
        for(int i=0;i<l2.size();i++){
            ar[op]=l2.get(i);
            op++;
        }
        return ar;
    }
}