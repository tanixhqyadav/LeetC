class Pair{
    String s;
    int c;
    Pair(String s, int c){
        this.s=s;
        this.c=c;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> mp=new HashMap<>();
        for(int i=0;i<words.length;i++){
            mp.put(words[i], mp.getOrDefault(words[i],0)+1);
        }
        // PriorityQueue<Pair> q=new PriorityQueue<>((a,b) -> b.c - a.c); use min heap
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> {
            if (a.c == b.c) return b.s.compareTo(a.s); // lexicographically higher comes first so it can be removed
            return a.c - b.c; // lower freq comes first
        });
        for(String s: mp.keySet()){
            System.out.println(s);
            q.add(new Pair(s, mp.get(s)));
            if(q.size()>k){
                q.poll();
            }
        }
        List<String> l = new ArrayList<>();
        while (!q.isEmpty()) {
            l.add(q.poll().s);
        }
        Collections.reverse(l);
        return l;
    }
}