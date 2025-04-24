class Solution {
    public int countLargestGroup(int n) {
        if(n<=9) return n;
        HashMap<Integer,Integer> mp=new HashMap<>(); 
        for(int i=1;i<=n;i++){
            mp.put(chota(i),mp.getOrDefault(chota(i),0)+1);
        }
        int mx=0;
        for(Integer i:mp.keySet()){
            mx=Math.max(mx,mp.get(i));
        }
        int c=0;
        for(Integer op:mp.keySet()){
            if(mp.get(op)==mx){
                c++;
            }
        }
        return c;
    }
    public static int chota(int n){
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
    return s;
    }
}