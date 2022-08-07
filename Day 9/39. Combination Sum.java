// 39. Combination Sum

// Not that Optimal----------------------------------------------------------------------
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
      Arrays.sort(candidates);
      combinations(candidates, 0, 0, target, new ArrayList<>(),0);
      return result;     
    }
    
    List<List<Integer>> result = new ArrayList<>();
    public void combinations(int[] candidates, int idx, int sum, int target, List<Integer> res, int start){
        
        if(sum > target){
            return ;
        }
        else if(sum == target){
            result.add(new ArrayList(res));
        }
        //Here again I am taking element all over from start again and agian for all calls therefore duplicates will come but as if I will change the start point on calls of non pick then I will not get duplicates
        // As we dont want it all over agaon we just want to to go ahead and next
        for(int i=start; i<candidates.length; i++){
            res.add(candidates[i]);
            combinations(candidates, i, sum+candidates[i], target, res, i);
            res.remove(res.size()-1);
        }
        
    }
}
