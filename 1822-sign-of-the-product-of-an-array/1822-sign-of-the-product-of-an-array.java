// class Solution {
//     public int arraySign(int[] nums) {
//         int neg=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0)
//                 return 0;
//             else if(nums[i]<0)
//                 neg++;
//         }
//         return (neg%2==0)?1:-1;
//     }
// }

class Solution {
    public int arraySign(int[] nums) {

        int sign = 1;

        for (int num : nums) {

            if (num == 0)
                return 0;

            if (num < 0)
                sign = -sign;
        }

        return sign;
    }
}