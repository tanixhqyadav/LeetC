// class Solution {
//     public int numSubseq(int[] nums, int t) {
//         Arrays.sort(nums);
//         int i=0;
//         int j=nums.length-1;
//         long ans=0;
//         int mod=1_000_000_007;
//         while(i<=j){
//             int mid=i+(j-i)/2;
//             if(isItP(nums,t,i,mid)){
//                 ans=Math.max(ans,(long)countsubs(i,mid,mod)); 
//                 i=mid+1;
//             }
//             else{
//                 j=mid-1;
//             }
//         }
//         return (int)(ans % 1_000_000_007);
//     }
//     public static boolean isItP(int nums[],int t,int x,int m){
//         int s=0;
//         for(int i=x;i<=m;i++){
//             s+=nums[i];
//         }
//         return s<=t;
//     }
//     public static int countsubs(int i , int k, int mod){
//         int len=k-i+1;
//         if(len<=0) return 0;
//         long res=1;
//         for(int p=0;p<len;p++) {
//             res=(res*2)%mod;
//         }
//         return (int)((res-1+mod)%mod);
//     }
// }
import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int t) {
        int mod = 1_000_000_007;
        Arrays.sort(nums);
        int n = nums.length;
        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % mod;
        }

        int i = 0, j = n - 1;
        int ans = 0;
        while (i <= j) {
            if (nums[i] + nums[j] <= t) {
                ans = (ans + pow[j - i]) % mod;
                i++;
            } else {
                j--;
            }
        }

        return ans;
    }
}
