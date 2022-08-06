// 78. Subsets


// -------------------------------------------------------
// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {

//         List<List<Integer>> result = new ArrayList<>(); 

//         int limit = (int)Math.pow(2, nums.length);

//         //Creating a loop for all the binary cases
//         for(int i=0 ; i<limit ; i++){

//             // creating binary number for each element(i)
//             int temp = i;
//             List<Integer> res = new ArrayList<>();
//             //Also looping through the array to put the elemet whose binary is 1
//             for(int j=nums.length-1 ; j>=0 ; j--){
//                 int rem = temp%2;
//                 temp = temp/2;
//                 if(rem == 1){
//                     res.add(nums[j]);
//                 }else{

//                 }
//             }
//              result.add(res);
//         }

//         return result;
//     }
//         // Time Complexity : O(N * 2^N)
//         // Space Complexity : O(2^N)
// }
