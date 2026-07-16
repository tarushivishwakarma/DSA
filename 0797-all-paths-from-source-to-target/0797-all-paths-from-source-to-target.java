class Solution {
    static void allPaths(int[][] gr,LinkedHashSet<Integer> hs,List<List<Integer>> ans,int s,int d){
        hs.add(s);
        if(s==d)
            ans.add(new ArrayList<>(hs));
        else{
            for(int i:gr[s])
                allPaths(gr,hs,ans,i,d);
        }
        hs.remove(s);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        allPaths(graph,hs,ans,0,graph.length-1);
        return ans;
    }
}