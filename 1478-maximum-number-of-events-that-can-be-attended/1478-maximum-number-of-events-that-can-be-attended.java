class Solution {
    public int endSort(List<int[]> list) {
        int n = list.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0;
        int eventCount = 0;
        int currDay = list.get(0)[0];

        while(!pq.isEmpty() || i<n){
            if(pq.isEmpty()) currDay = list.get(i)[0];

            while(i<n && list.get(i)[0] == currDay){
                int end = list.get(i)[1];
                pq.offer(end);
                i++;
            }
            
            pq.poll();
            eventCount++;

            currDay++;
            while(!pq.isEmpty() && currDay>pq.peek()){     
                pq.poll();
            }  

        }

        return eventCount;
    }
    
    public int maxEvents(int[][] events) {
        int n = events.length;
        ArrayList<int[]> list = new ArrayList<>();
        for(int[] event : events){
            list.add(event);
        }

        Collections.sort(list, (a,b)-> a[0]==b[0]? a[1]-b[1]: a[0]-b[0]);

        return endSort(list);
    }
}