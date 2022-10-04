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

//Approach 3 binary search - O(log n)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int start = 0, end = nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        while(start<end){
            
            int mid = start + (end - start)/2;
            if(mid>0 && nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
           else if(mid%2==0 && nums[mid]==nums[mid+1]){
                start = mid + 1;
            }
            else if(mid%2==0 && nums[mid]!=nums[mid+1]){
                end = mid-1;
            }
            else if(mid>0 && mid%2!=0 && nums[mid]==nums[mid-1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return nums[start];
    }
}

//Approach 4 count the frequency of element and return element with 1 frequency - O(n)
