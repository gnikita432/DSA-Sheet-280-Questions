// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Approach 3 : sort the array and two pointer thn no this wont work 
        // Always remember that - when we want index then sorting dont work 😅 
        Arrays.sort(nums);
        int[] ans = new int[2];
        int i = 0 , j = nums.length-1;
        while(nums[i]+nums[j] != target){
            if(nums[i]+nums[j] > target){
                j--;
            }else{
                i++;
            }
        }
        ans[0] = i;
        ans[1] = j;
        
        //Approach 2 : Save all the elements in hashmap and then again run a for loop in entire array and when we get the complement of that number then reutrn that key and that ele.
//               int[] ans = new int[2];
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i=0; i<nums.length; i++){
//             map.put(nums[i], i);
//         }
        
//         for(int i=0; i<nums.length; i++){
//             if(map.containsKey(target-nums[i])  && map.get(target-nums[i])!=i ){
//                 ans[0] = i;
//                 ans[1] = map.get(target-nums[i]);
//             }
//         }
        
        // Approach 1 : Brute force - 2 for loops
        // int[] ans = new int[2];
        // for(int i = 0 ; i<nums.length; i++){
        //     for(int j = i + 1 ; j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans[0]=i;
        //             ans[1]=j;
        //             break;
        //         }
        //     }
        // }
         return ans;
    }
}
