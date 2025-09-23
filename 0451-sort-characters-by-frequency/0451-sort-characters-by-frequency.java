class Pair{
    char ch;
    int c;
    Pair(char ch, int c){
        this.ch=ch;
        this.c=c;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            if(mp.get(a.ch)==mp.get(b.ch)){
                return Character.compare(a.ch,b.ch);
            }
            return Integer.compare(b.c,a.c);
        });
        for(Character ch:mp.keySet()){
            pq.add(new Pair(ch,mp.get(ch)));
        }
        String ans="";
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            char c=p.ch;
            int co=p.c;
            while(co!=0){
                ans+=c;
                co--;
            }
            // ans+=p.ch;
        }
        return ans;
    }
}