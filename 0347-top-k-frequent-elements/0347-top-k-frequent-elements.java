class Solution {
    public int[] topKFrequent(int[] ar, int k) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            mp.put(ar[i], mp.getOrDefault(ar[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> mp.get(b) - mp.get(a));
        // for(Integer ke : mp.keySet()){
        //     if(!pq.isEmpty() && mp.get(pq.peek())>=mp.get(ke)){
        //         pq.poll();
        //         pq.add(ke);
        //     }
        //     pq.add(ke);
        // }
        pq.addAll(mp.keySet());

        int ari[]=new int[k];
        for(int i=0;i<k;i++){
            ari[i]=pq.poll();
        }
        return ari;
    }
}