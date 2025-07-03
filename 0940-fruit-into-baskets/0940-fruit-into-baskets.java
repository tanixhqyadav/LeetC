// class Solution {
//     public int totalFruit(int[] fr) {
//         HashMap<Integer, Integer> mp=new HashMap<>();
//         int k=2;
//         int mx=0;
//         int ans=0;
//         int i=0;
//         int j=0;
//         while(i<fr.length){
//             mp.put(fr[i],mp.getOrDefault(fr[i],0)+1);
//             if(mp.size()<=k){
//                 mx=Math.max(mx+mp.get(fr[i]),mx);
//             }else{
//                 mx-=mp.get(fr[j]);
//                 mp.remove(fr[j]);
//                 j++;
//             }
//             // ans=Math.max(ans,mx);
//             i++;
//         }
//         // System.out.println(mp);
//         for(Integer x:mp.keySet()){
//             ans+=mp.get(x);
//         }
//         return ans;
//     }
// }
class Solution {
    public int totalFruit(int[] fr) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        int k=2;
        int mx=0;
        int ans=0;
        int i=0;
        int j=0;
        while(i<fr.length){
            mp.put(fr[i],mp.getOrDefault(fr[i],0)+1);
            if(mp.size()>k){
                while(mp.size()>k){
                    mp.put(fr[j],mp.get(fr[j])-1);
                    if(mp.get(fr[j])==0) mp.remove(fr[j]);
                    j++;
                }
                // System.out.println(ans+" "+i+" "+j);
            }
            ans=Math.max(ans,i-j+1);
            i++;
        }
        
        return ans;
    }
}