// 118. Pascal's Triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        // The current row list and the previous row list
        List<Integer> row, prev = null;
        
        // outer loop for columns
        for(int i = 0; i<numRows; i++){
            row = new ArrayList<>();
            //inner loop for rows j would run till i as i == no of columns
            for(int j = 0; j<=i; j++){
                if( j == 0 || j == i){
                    row.add(1);
                }else{
                   int curr = prev.get(j-1) + prev.get(j);
                    row.add(curr);
                }
            }
            result.add(row);
            prev = row;
        }
        return result;
    }
}
// Time complexity : O(n^2)
// Space complexity : O(1)
