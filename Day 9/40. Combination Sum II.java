// 40. Combination Sum II

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        combinations(candidates, 0, target, new ArrayList<>());
        return result;
    }
    
    List<List<Integer>> result = new ArrayList<>();
    public void combinations(int[] candidates, int idx, int target, List<Integer>res){
        
        if(target == 0){
            result.add(new ArrayList<>(res));
            return;
        }
        
        for(int i = idx; i<candidates.length ; i++){
            if(i>idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            
            res.add(candidates[i]);
            combinations(candidates, i+1, target-candidates[i], res);
            res.remove(res.size()-1);
            
        } 
        
    }
}

