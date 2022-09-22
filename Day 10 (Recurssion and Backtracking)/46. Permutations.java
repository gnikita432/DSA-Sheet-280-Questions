// 46. Permutations

class Solution {
    public List<List<Integer>> permute(int[] nums) {
      
        List<Integer> ds = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        List<List<Integer>> fres = new ArrayList<>();
        permutations(nums, ds, map, fres);
        return fres;
        
    }
   
    public void permutations(int[] nums, List<Integer> ds, boolean[] map, List<List<Integer>> fres){
        
        if(ds.size() == nums.length){
            fres.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = 0 ; i<nums.length; i++){
            if(!map[i]){
                ds.add(nums[i]);
                map[i] = true;
                permutations(nums, ds, map, fres);
                map[i] = false;
                ds.remove(ds.size()-1);
            }
        }
        
    }
    
}
