// 84. Largest Rectangle in Histogram

// Approach 1 : TLE O(n^2) find all rectangles considering each height one by one

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea = 0;
        for(int i = 0 ; i<heights.length ; i++){
            int h = heights[i];
            int jright = i+1;
            int jleft = i-1;
            int area = h;
            while(jleft>=0 && heights[jleft]>=h){
                area+=h;
                jleft--;
            }
            while(jright<heights.length && heights[jright]>=h){
                area+=h;
                jright++;
            }
            if(area>maxarea){
                maxarea = area;
            }
        }
        return maxarea;
    }
}
