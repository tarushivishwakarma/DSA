class Solution {
    class Edge{
        int v;
        int w;
        Edge(int x,int y){
            this.v=x;
            this.w=y;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Edge>> gr=new ArrayList<>();
        for(int i=0;i<=n;i++)
            gr.add(new ArrayList<>());
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            gr.get(u).add(new Edge(v,w));
        }
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.offer(new Edge(k,0));
        int[] ans=new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k]=0;
        int cost=0;
        while(!pq.isEmpty()){
            Edge curr=pq.poll();
            if(ans[curr.v]<curr.w)
                continue;
            for(Edge i:gr.get(curr.v)){
                if(curr.w != -1){
                    cost = cost + curr.w;
                    
                }
                if(ans[curr.v]+i.w<ans[i.v]){
                    ans[i.v]=ans[curr.v]+i.w;
                    pq.offer(new Edge(i.v,ans[i.v]));
                }
            }
        }
        int max = 0;

for (int i = 1; i <= n; i++) {

    if (ans[i] == Integer.MAX_VALUE)
        return -1;

    max = Math.max(max, ans[i]);
}

return max;      
    }
}