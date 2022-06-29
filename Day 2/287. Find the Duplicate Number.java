// 287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        
        // Approach different : Linked List cycle method
        
        // Approach 1 : make a frequency array till n and add numbers and the number which occours 2 times is the duplicate number ---- O(n)  O(n)
        
        // Approach 2 : We will sort the array and loop through it to find duplicate number ---O(nlogn) O(1)
        
        // Approach 3 : Will use count sort that is we will have a pointer in the first element and swap that element with its index element that is arr[arr[i]-1] = arr[i] and if while placing that element we see it is already their then it is duplicate ----- O(n) O(1)
        
        //Approach 4 : Two loops ---- O(n^2) O(1)
        
        // Approach 5 : Marking visited value within the array
// Since all values of the array are between [1..n] and the array size is n+1，while scanning the array from left to right, we set the nums[n] to its negative value.

// With extra O(1) space, with modifying the input.

//     // Visited
//     public static int findDuplicate_mark(int[] nums) {
//         int len = nums.length;
//         for (int num : nums) {
//             int idx = Math.abs(num);
//             if (nums[idx] < 0) {
//                 return idx;
//             }
//             nums[idx] = -nums[idx];
//         }

//         return len;
//     }
// Analysis
// Time Complexity: O(n)
// Space Complexity: O(1)
        
        
    }
}
