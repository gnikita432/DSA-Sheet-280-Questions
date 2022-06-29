// 56. Merge Intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        
        //First sort the array
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<List<Integer>> mergeintervals = new ArrayList<>();
        
        List<Integer> interval = new ArrayList<>();
        // First merged element
        interval.add(intervals[0][0]);
        interval.add(intervals[0][1]);
        
        for(int[] i : intervals){
            
            // if the end of the ith interval is less then or equal to the end of merged element then we will simply merge our new ele in that
            if(i[0]<=interval.get(1)){
                // merging this element in existing interval
                interval.set(1, Math.max(interval.get(1), i[1])); //setting the larger element to be the end and no need to change the start as it is already in sorted array so start will be the smallest
            }
            else{
                // if merging is over then we will add it to the main list
                mergeintervals.add(interval);
                // and then again start with a new one
                interval = new ArrayList<>();
                interval.add(i[0]);
                interval.add(i[1]);
            }
        }
       // Adding the last element in the list too
        mergeintervals.add(interval);
     
        //converting list into 2d Array
        int[][] result = mergeintervals.stream().map(  u  ->  u.stream().mapToInt(i->i).toArray()  ).toArray(int[][]::new);
        return result;
    }
}
//O(n) O(n)
