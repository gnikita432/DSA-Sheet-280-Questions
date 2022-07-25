// 485. Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0, maxcount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) count++;
            else count = 0;
            maxcount = Math.max(count, maxcount);
        }
        return maxcount;
    }
}
// O(n) O(1)
