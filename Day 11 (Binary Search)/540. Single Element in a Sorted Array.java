// 540. Single Element in a Sorted Array

// Apporach 1 ------- O(n)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = nums[0];
        for(int i=1 ; i<nums.length ; i++){
           ans^=nums[i];
        }
        return ans;
    }
}
