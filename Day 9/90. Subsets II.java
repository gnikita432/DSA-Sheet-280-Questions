// 90. Subsets II

class Solution {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        //Sort to  check the elements are same or not
        Arrays.sort(nums);
		subset(nums.length, nums, 0, new ArrayList<>(), false);

		return result;
	}

	List<List<Integer>> result = new ArrayList<>();

	private void subset(int N, int[] nums, int idx, List<Integer> res, boolean visiting) {

		if (idx >= N) {
			result.add(new ArrayList<>(res));
			return;
		}
		if (idx == 0 || nums[idx] != nums[idx - 1] || visiting) {
			// case 1 : we pick the element
			res.add(nums[idx]);
			subset(N, nums, idx + 1, res, true); // move ahead
			res.remove(res.size() - 1);
		}
		// case 2 : we don't pick the element ( notice, we did not add the current element in our temporary list
		subset(N, nums, idx + 1, res, false); // move ahead

	}

}
// Time Complexity : O(2^n + nlogn)
// Space Complexity : O(2^n)
