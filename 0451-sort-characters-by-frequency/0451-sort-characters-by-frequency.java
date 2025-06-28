class Pair{
    char ch;
    int frq;
    Pair(char ch, int frq){
        this.ch=ch;
        this.frq=frq;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            if(mp.get(a.ch)==mp.get(b.ch)){
                return Character.compare(a.ch,b.ch);
            }else{
                return Integer.compare(mp.get(b.ch),mp.get(a.ch));
            }
        });
        for(Character ch: mp.keySet()){
            pq.add(new Pair(ch,mp.get(ch)));
        }
        String ans="";
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            char jk=p.ch;
            int fk=p.frq;
            while(fk-->0){
                ans+=jk;
            }
        }
        return ans;
    }
}