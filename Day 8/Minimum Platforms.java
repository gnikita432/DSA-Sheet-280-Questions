// Minimum Platforms - https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int maxtrains = 0;
        int minplatforms = 0;
        int i = 0 ; int j = 0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                maxtrains++;
                i++;
            }else{
                maxtrains--;
                j++;
            }
            minplatforms = Math.max(maxtrains, minplatforms);
        }
        return minplatforms;
    }
}

//  Time Complexity: O(nLogn)
//  Auxiliary Space: O(n)
