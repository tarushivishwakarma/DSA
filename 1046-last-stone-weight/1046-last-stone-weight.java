// class Solution {
//     public int lastStoneWeight(int[] stones) {

//         int n = stones.length;

//         while (n > 1) {

//             Arrays.sort(stones, 0, n);

//             int x = stones[n - 1];
//             int y = stones[n - 2];

//             if (x == y)
//                 n -= 2;
//             else {
//                 stones[n - 2] = x - y;
//                 n--;
//             }
//         }

//         return n == 0 ? 0 : stones[0];
//     }
// }

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones)
            pq.offer(stone);

        while (pq.size() > 1) {

            int x = pq.poll();
            int y = pq.poll();

            if (x != y)
                pq.offer(x - y);
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}