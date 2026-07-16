class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)
            return true;
        ArrayList<ArrayList<Integer>> gr=new ArrayList<>();
        for(int i=0;i<n;i++)
            gr.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            gr.get(u).add(v);
            gr.get(v).add(u);
        }
        HashSet<Integer> hs=new HashSet<>();
        Deque<Integer> q=new ArrayDeque<>();
        q.addLast(source);
        hs.add(source);
        while(!q.isEmpty()){
            int curr=q.pop();
            for(Integer i:gr.get(curr)){
                if(!hs.contains(i)){
                    if(i==destination)
                        return true;
                    q.addLast(i);
                    hs.add(i);
                }
            }
        }
        return false;
    }
}