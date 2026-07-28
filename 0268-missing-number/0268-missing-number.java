class Solution {
    public int missingNumber(int[] nums) {
        int ans=nums.length;
        for(int i=0;i<nums.length;i++){
            ans^=i;
            ans^=nums[i];
        }
        return ans;



//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=i)
//                 return i;
//         }
//         return nums.length;
    }
}

// class Solution {
//     public int missingNumber(int[] nums) {

//         int n = nums.length;
//         int expected = n * (n + 1) / 2;

//         int actual = 0;
//         for (int num : nums)
//             actual += num;

//         return expected - actual;
//     }
// }