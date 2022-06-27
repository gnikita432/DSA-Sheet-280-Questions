// 442. Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       
        List <Integer> ans = new ArrayList<>();
        
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        
        int j = 0;
        while(j<nums.length){
            if(j+1 != nums[j]){
                ans.add(nums[j]);
            }
            j++;
        }
        return ans;
    }
}
// Approach 1 - Sort the array and find duplicates - O(log n) O(1)
// Approach 2 - Another method is of taking frequency array - O(n) O(n)
