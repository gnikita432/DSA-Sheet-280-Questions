// 239. Sliding Window Maximum

// Approach 1 - Naive Solution - TLE - O(n*k)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length - (k-1)];
        for(int i = 0 ; i<nums.length-(k-1); i++){
            int max = Integer.MIN_VALUE;
            for(int j = i ; j<k+i ; j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            }
            res[i] = max;
        }
        return res;
    }
}
