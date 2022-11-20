// 84. Largest Rectangle in Histogram

// Approach 2 - stack
// Find boundries of an element in nser and nsel and them calculate area from those width and height
// Time complexity  : O(3n)
// Space Complexity : O(2n)
class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0, maxarea = 0;
        int[] nser = nextSmallestElementRight(heights);
        int[] nsel = nextSmallestElementLeft(heights);
        for(int i = 0 ; i<heights.length; i++){
            area = heights[i] * (nser[i]-nsel[i]-1);
            if(area>maxarea)
                maxarea = area;
        }
        return maxarea;
    }
    public int[] nextSmallestElementRight(int[] heights){
        int[] nser = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<heights.length; i++){
            while(st.size()>0 && heights[st.peek()]>heights[i]){
                nser[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            nser[st.peek()] = heights.length;
            st.pop();
        }
        return nser;
    }
    public int[] nextSmallestElementLeft(int[] heights){
        int[] nsel = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i = heights.length-1 ; i>=0; i--){
            while(st.size()>0 && heights[st.peek()]>heights[i]){
                nsel[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            nsel[st.peek()] = -1;
            st.pop();
        }
        return nsel;
    }
}


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
