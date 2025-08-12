class Solution {
    public boolean reorderedPowerOf2(int n) {
        if(powT(n)==0){
            return true;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<=30;i++){
            int p=(int) Math.pow(2,i);
            if(powT(p)==0){
                l.add(p);
            }
        }
        System.out.println(l);
        List<Integer> ll=new ArrayList<>();
        for(int i=l.size()-1;i>=0;i--){
            if(len(l.get(i))==len(n)){
                ll.add(l.get(i));
            }
        }
        Map<Integer, Integer> mp=new HashMap<>();
        while(n!=0){
           mp.put(n%10, mp.getOrDefault(n%10,0)+1);
            n/=10; 
        }
        for(int i=0;i<ll.size();i++){
            if(op(ll.get(i)).equals(mp)){
                return true;
            }
        }
        return false;
    }
    public static Map<Integer, Integer> op(int n){
        Map<Integer, Integer> mp=new HashMap<>();
        while(n!=0){
            mp.put(n%10, mp.getOrDefault(n%10,0)+1);
            n/=10;
        }
        return mp;
    }
    public static int len(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
    public static int powT(int n){
        // System.out.println(n);
        if(n==1) return 0;
        if(n%2==1) return 1;
        return powT(n/2);
    }
}