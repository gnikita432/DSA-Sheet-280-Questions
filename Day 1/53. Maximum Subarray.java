// 53. Maximum Subarray - Kadanes Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        
        int curr = 0;
        int max = nums[0];
        
        for(int i = 0; i<nums.length; i++){
            if(curr<=0){
                curr = nums[i];
            }else{
                curr+=nums[i];
            }
            if(max<curr){
                max = curr;
            }
        }
        return max;
    }
}
