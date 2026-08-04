// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         List<Integer> ans=new ArrayList<>();
//         Arrays.sort(nums);
//         int l=nums[0];
//         for(int i=1;i<nums.length;i++){
//             while(nums[i]>l+1){
//                 ans.add(l+1);
//                 l++;
//             }
//             l=nums[i];
//         }
//         return ans;
//     }
// }

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i))
                ans.add(i);
        }

        return ans;
    }
}