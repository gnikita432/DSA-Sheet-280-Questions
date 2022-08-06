// 78. Subsets

class Solution {
    public List < List < Integer >> subsets(int[] nums) {

        subset(nums.length, nums, 0, new ArrayList < > ());

        return result;
    }
    
    List < List < Integer >> result = new ArrayList < > ();

    private void subset(int N, int[] nums, int idx, List < Integer > res) {

        if (idx >= N) {
            result.add(new ArrayList < > (res));
            return;
        }

        //  does not work this two
        // subset(N, nums, idx+1, res.add(nums[idx]));
        // subset(N, nums, idx+1, res);

        // main logic
        // case 1 : we pick the element
        res.add(nums[idx]);
        subset(N, nums, idx + 1, res); // move ahead
        res.remove(res.size() - 1);

        // case 2 : we don't pick the element ( notice, we did not add the current element in our temporary list
        subset(N, nums, idx + 1, res); // move ahead

    }

    // Time Complexity : 
    // Space Complexity : 
}




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
