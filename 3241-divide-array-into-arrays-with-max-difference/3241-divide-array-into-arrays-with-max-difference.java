// class Solution {
//     public int[][] divideArray(int[] nums, int k) {
//         Arrays.sort(nums);
//         // int mx=0;
//         int arr[][]=new int[nums.length/3][3];
//         int co=0;
//         for(int i=0;i<nums.length;i+=3){
//             int a=nums[i];
//             int b=nums[i+1];
//             int c=nums[i+2];
//             int mi=0;
//             int mx=0;
//             mx=Math.max(a,Math.max(b,c));
//             mi=Math.min(a,Math.min(b,c));
//             if(mx-mi<=k){
//                 co++;
//             }
//         }
//         if(nums.length%co==0){
//             for(int i=0;i<nums.length;i+=3){
//                 for(int j=i;j<i+3;j++){
//                     arr[i][j]=nums[j];
//                 }
//             }
//             return arr;
//         }
//         return new int[0][0];
//     }
// }
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] arr = new int[nums.length/3][3];
        for (int i=0, row=0; i<nums.length; i+=3, row++) {
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            int max=Math.max(a,Math.max(b,c)), min=Math.min(a,Math.min(b,c));
            if (max-min>k) return new int[0][0];
            arr[row][0]=a; 
            arr[row][1]=b; 
            arr[row][2]=c;
        }
        return arr;
    }
}
