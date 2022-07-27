// Job Sequencing Problem - https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#

class ProfitComparator implements Comparator<Job>{
    public int compare(Job j1, Job j2){
        if(j1.profit < j2.profit) return 1;
        else return -1;
    }
}

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        int[] res = new int[2];
        //Step 1 : sort the array according to their profit
        Arrays.sort(arr, (a,b)-> Integer.compare(b.profit, a.profit));
        // ----- This is just an alternative way to sort the elements
        // ProfitComparator pc = new ProfitComparator();
        // Arrays.sort(arr, pc);
        
        //Step 2 : Find the maximum no. of deadline
        int maxdeadline = 0;
        for(Job j : arr){
            if(j.deadline >= maxdeadline){
                maxdeadline = j.deadline;
            }
        }
        
        //Step 3 : create an array of maxdeadline and start filling it from reverse order
        int[] deadlinearr = new int[maxdeadline + 1];
        // as indexing is from 1
        // for(int i = 1 ; i<= maxdeadline ; i++){
        // deadlinearr[i] = -1;
        // }
        //or
        deadlinearr[0] = -1;
        
        int jobProfit = 0;
        int countJobs = 0;
        for(Job jb : arr){
            for (int j = jb.deadline; j > 0; j--) {
            // Free slot found 
            if (deadlinearr[j] == 0) {
               deadlinearr[j] = jb.id;
               countJobs++;
               jobProfit += jb.profit;
               break;
            }
        }
        }
        res[0] = countJobs;
        res[1] = jobProfit;
        
        return res;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/

// Time Complexity: O(NlogN + n*n)
// Auxilliary Space: O(N)
