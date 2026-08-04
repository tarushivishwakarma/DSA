// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(int i=0;i<n;i++){
//             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
//         }
//         for(int i=0;i<n;i++){
//             if(hm.get(nums[i])>n/2)
//                 return nums[i];
//         }
//         return 0;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0)
                candidate = num;

            if (num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }
}