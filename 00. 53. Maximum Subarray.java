// 53. Maximum Subarray

//Brute force approach
class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>max){
                    max=sum;
                }
            }
            sum=0;
        }
        return max;
    }
}


//Optimal approach - kadanes algorithm
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
