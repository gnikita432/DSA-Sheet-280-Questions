// 128. Longest Consecutive Sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        
        //Approach 2 : Hashmap - O(n) O(n)
        HashMap<Integer, Boolean> hm = new HashMap<>();
          int max = 0;
    
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], true);
        }
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i]-1)){
                hm.put(nums[i], false);
            }
        }
        for(int i=0; i<nums.length ; i++){
           int tmax=1;
            if(hm.get(nums[i])){
                while(hm.containsKey(nums[i]+tmax)){
                    tmax++;
                }
            }
            if(max<tmax){
                max = tmax;
            }
        }
        return max;
    }
}

    // Approach 1 : Sort and then have a max and find tempmax each time in loop
        // - O(nlog n + n)
//         if (nums.length == 0) {
//             return 0;
//         }
//             Arrays.sort(nums);
//             int max = 1;
//             int tempmax=1;
        
//         for(int i=0; i<nums.length-1; i++){
//             if(nums[i]+1 == nums[i+1]){
//                 tempmax++;
//             }else if(nums[i]==nums[i+1]){
                
//             }
//             else{
//                 tempmax=1;
//             }
//             if(tempmax>=max){
//                 max=tempmax;
//             }
//         }
//          return max;
