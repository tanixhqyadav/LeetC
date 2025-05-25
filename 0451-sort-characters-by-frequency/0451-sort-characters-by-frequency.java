class Pair{
    char ch;
    int frq;
    Pair(char ch , int frq){
        this.ch=ch;
        this.frq=frq;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        List<Pair> l=new ArrayList<>();
        // PriorityQueue<Character> pq=new PriorityQueue<>();
        for(Character ch:mp.keySet()){
            l.add(new Pair(ch,mp.get(ch)));
        }
        Collections.sort(l, (a, b) -> {
            if (a.frq == b.frq) {
            return Character.compare(a.ch, b.ch);
            }
            return Integer.compare(b.frq, a.frq); 
        });
        String ans="";
        for(int i=0;i<l.size();i++){
            Pair x=l.get(i);
            int fr=x.frq;
            char c=x.ch;
            while(fr!=0){
                ans+=c;
                fr--;
            }
        }
        return ans;
    }
}