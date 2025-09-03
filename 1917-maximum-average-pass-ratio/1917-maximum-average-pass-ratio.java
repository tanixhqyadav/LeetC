class Pair {
    double pr;
    int ar[] = new int[2];
    Pair(double pr, int ar[]) {
        this.pr = pr;
        this.ar = ar;
    }
}
class Solution {
    public double maxAverageRatio(int[][] cl, int exs) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.pr, a.pr));
        for (int i = 0; i < cl.length; i++) {
            double ratio = ((double) cl[i][0] / cl[i][1]);
            double gain = ((double) (cl[i][0] + 1) / (cl[i][1] + 1)) - ratio;
            pq.add(new Pair(gain, cl[i]));
        }
        while (exs-- > 0) {
            Pair p = pq.poll();
            p.ar[0]++;
            p.ar[1]++;
            double ratio = ((double) p.ar[0] / p.ar[1]);
            double gain = ((double) (p.ar[0] + 1) / (p.ar[1] + 1)) - ratio;
            pq.add(new Pair(gain, p.ar));
        }
        double sum = 0.0;
        for (Pair p : pq) {
            sum += (double) p.ar[0] / p.ar[1];
        }
        return sum / cl.length;
    }
}
