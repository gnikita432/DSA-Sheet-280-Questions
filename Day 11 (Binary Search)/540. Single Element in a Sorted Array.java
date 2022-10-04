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

//Approach 2 ---------- O(n)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // Approach 2: traverse and check
        if(nums.length == 1) return nums[0];
        int i = 0;
        while(i<nums.length-1){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }else{
                i+=2;
            }
        }
        return nums[nums.length-1];
    }
}
