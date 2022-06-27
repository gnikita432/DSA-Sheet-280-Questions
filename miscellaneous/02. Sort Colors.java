class Solution {
    public void sortColors(int[] nums) {
        
        int zero = 0, one = 0, two = nums.length-1, i=0;
        
        while(i<=two){
            if(nums[i]==0){
                one++;
                int temp = nums[zero];
                nums[zero]= nums[i];
                nums[i] = temp;
                zero++;
                i++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                int temp = nums[i] ;
                nums[i] = nums[two];
                nums[two] = temp;
                two--;
                
            }
        }
        
    }
}
