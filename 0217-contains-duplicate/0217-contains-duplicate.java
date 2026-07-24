class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if (hs.contains(nums[i]))
                return true;
            hs.add(nums[i]);
        }
        return false;


        // HashMap<Integer,Integer> hm= new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        //     if(hm.get(nums[i])>1)
        //         return true;
        // }
        // return false;
    }
}