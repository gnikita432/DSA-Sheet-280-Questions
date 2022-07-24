// 42. Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        
        int[] prefix = new int[height.length];
        int[] postfix = new int[height.length];
        
        //Prefix
        prefix[0] = height[0];
        for(int i=1 ; i<height.length; i++){
            if(prefix[i-1]<=height[i]) prefix[i] = height[i];
            else prefix[i] = prefix[i-1];
        }
        
        //postfix
        postfix[height.length - 1] = height[height.length-1];
         for(int i=height.length-1 ; i>0; i--){
            if(postfix[i]<=height[i-1]) postfix[i-1] = height[i-1];
            else postfix[i-1] = postfix[i];
        }
        
        //Now finding the water trapped in each index
        int sum = 0;
        for(int i=0; i<height.length; i++){
            sum+= Math.min(prefix[i], postfix[i]) - height[i] ; 
        }
        
        return sum;
        
        // O(3n) O(2n)
    }
}
