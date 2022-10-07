// 503. Next Greater Element II

// Approach 1: Brute force - traverse each element and for each element again traverse till that element(circular) to find greater element. 
// ----------------------O(n^2)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length];
        for(int i = 0; i< res.length; i++){
            res[i] = -1;
        }
        for(int i = 0; i< nums.length; i++){
            int ele = nums[i];
            for(int j = i+1; j<=nums.length + i ; j++){
                int a = nums[j%nums.length];
                if(a>ele){
                    res[i] = a;
                    break;
                }
            }
        }
        return res;
    }
}
