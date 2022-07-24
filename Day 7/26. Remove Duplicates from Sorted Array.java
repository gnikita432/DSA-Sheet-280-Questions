// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
   
        int p = 0;
 
        for(int i = 1 ; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                p++;
                nums[p] = nums[i];
            }
        }
        
        return p+1;
    }
    
    //Approach 1 : Making a frequency array space - O(n)
    //Approach 2 : HashMap and print the keyset space - O(n)
    //Approach 3 : Normal for loop with two pointers space - O(1)
    
}
