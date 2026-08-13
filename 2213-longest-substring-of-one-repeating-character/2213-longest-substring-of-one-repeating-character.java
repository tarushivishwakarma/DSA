class Solution {
    int[] left, right, best;
    char[] s;

    public int[] longestRepeating(String str, String queryCharacters, int[] queryIndices) {
        s = str.toCharArray();
        int n = s.length;

        left = new int[4 * n];
        right = new int[4 * n];
        best = new int[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {
            int idx = queryIndices[i];
            s[idx] = queryCharacters.charAt(i);

            update(1, 0, n - 1, idx);

            ans[i] = best[1];
        }

        return ans;
    }

    void build(int node, int l, int r) {
        if (l == r) {
            left[node] = right[node] = best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        merge(node, l, r);
    }

    void update(int node, int l, int r, int idx) {
        if (l == r) {
            left[node] = right[node] = best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (idx <= mid)
            update(node * 2, l, mid, idx);
        else
            update(node * 2 + 1, mid + 1, r, idx);

        merge(node, l, r);
    }

    void merge(int node, int l, int r) {
        int mid = (l + r) / 2;

        int a = node * 2;
        int b = node * 2 + 1;

        left[node] = left[a];
        right[node] = right[b];
        best[node] = Math.max(best[a], best[b]);

        if (s[mid] == s[mid + 1]) {
            if (left[a] == mid - l + 1)
                left[node] += left[b];

            if (right[b] == r - mid)
                right[node] += right[a];

            best[node] = Math.max(best[node], right[a] + left[b]);
        }
    }
}