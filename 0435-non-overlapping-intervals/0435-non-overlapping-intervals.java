class Solution {
    public int eraseOverlapIntervals(int[][] ivl) {
        Arrays.sort(ivl,(a,b)-> a[1]-b[1]);
        for(int i=0;i<ivl.length;i++){
            // System.out.print(ivl[i][0]+" "+ivl[i][1]);
        }
        int x=ivl[0][0];
        int c=0;
        for(int i=0;i<ivl.length;i++){
            if(ivl[i][0]>=x){
                c++;
                x=ivl[i][1];
            }
        }
        System.out.println(c);
        return ivl.length-c;      
    }
}
// class Solution {
//     public int eraseOverlapIntervals(int[][] arr) {
//         int n=arr.length;
//        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
//        int p=arr[0][0];
//        int c=0;
//        for(int i=0;i<n;i++){
//         if(arr[i][0]>=p){
//             c++;
//             p=arr[i][1];
//         }
//        }
//        return n-c;
//     }
// }