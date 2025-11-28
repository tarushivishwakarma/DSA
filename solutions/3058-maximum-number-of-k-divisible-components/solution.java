import java.util.*;

class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        // Build adjacency list for the tree
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        // We'll count how many subtrees have sum divisible by k
        int[] ans = new int[1]; // use array to modify inside DFS

        dfs(0, -1, graph, values, k, ans);

        return ans[0];
    }

    // Returns subtree sum % k for the current node
    private long dfs(int node, int parent,
                     List<Integer>[] graph, int[] values,
                     int k, int[] ans) {

        long sum = values[node]; // start with current node's value

        for (int nei : graph[node]) {
            if (nei == parent) continue; // don't go back up the tree
            sum += dfs(nei, node, graph, values, k, ans);
        }

        // If this subtree's sum is divisible by k,
        // it can become its own component.
        if (sum % k == 0) {
            ans[0]++;      // one valid component formed
            return 0;      // cut here, nothing passed to parent
        }

        // Otherwise pass the remainder up
        return sum % k;
    }
}

