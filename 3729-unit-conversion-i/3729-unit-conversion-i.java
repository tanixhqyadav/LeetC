import java.util.*;

class Pair {
    int node;
    int weight;
    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class Solution {
    static final int MOD = 1_000_000_007;
    
    public int[] baseUnitConversions(int[][] con) {
        int n = con.length + 1;
        List<List<Pair>> adj = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] c : con) {
            int from = c[0];
            int to = c[1];
            int factor = c[2];
            adj.get(from).add(new Pair(to, factor));
        }

        long[] result = new long[n];
        boolean[] visited = new boolean[n];
        
        dfs(0, 1L, adj, result, visited);

        int[] finalResult = new int[n];
        for (int i = 0; i < n; i++) {
            finalResult[i] = (int)(result[i] % MOD);
        }
        return finalResult;
    }

    private void dfs(int node, long val, List<List<Pair>> adj, long[] result, boolean[] visited) {
        visited[node] = true;
        result[node] = val;

        for (Pair neighbor : adj.get(node)) {
            if (!visited[neighbor.node]) {
                dfs(neighbor.node, (val * neighbor.weight) % MOD, adj, result, visited);
            }
        }
    }
}
