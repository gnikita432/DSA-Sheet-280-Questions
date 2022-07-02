// 62. Unique Paths

// Approach 1 time limit exceeded
class Solution {
    public int uniquePaths(int m, int n) {
		// base case
        if(m == 1 || n == 1) return 1;
        
		// move down
        int downMove = uniquePaths(m-1, n);
		// move right
        int rightMove = uniquePaths(m, n-1);
        
        return downMove + rightMove;
    }
}
