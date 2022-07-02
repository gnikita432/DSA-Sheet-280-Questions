// 169. Majority Element

//Approach 2 : Optimal solution O(n) O(1)
class Solution {
    public int majorityElement(int[] nums) {
     
        int ele = 0 , count = 0;
        int i=0;
        while(i<nums.length){
            if(count == 0){
                ele = nums[i];
                count++;
            }else if(ele==nums[i]){
                count++;
            }else{
                count--;
            }
            i++;
        }
     return ele;
    }
}

// Approach 1 : Brute

//Approach 1 brute force tc: O(nlogn) sc:O(n)
class Solution {
    public int majorityElement(int[] nums) {
        
        int num = nums.length/2;
        HashMap<Integer, Integer> hm = new HashMap<>();
      
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
            hm.put(nums[i], 1);
            }    
        }
    
        for(Integer key : hm.keySet()){
            if(hm.get(key)>num){
                return key;
            }
        }
        
        System.out.println(hm);
        return 0;
    }
}
