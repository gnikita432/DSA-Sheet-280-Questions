// 11. Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        
        int max=0, i = 0 , j = height.length-1;
        while(i<j){
            int cap = Math.min(height[i], height[j]) * (j-i);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            
            if(max<cap){
                max = cap;
            }
        }
        return max;
    }
}

//Tapping rainwater
