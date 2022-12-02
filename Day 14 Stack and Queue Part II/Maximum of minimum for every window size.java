// Maximum of minimum for every window size

//Approach - O(n^3) Brute force 
// for each window do a sliding window
public class Solution {
    public static int[] maxMinWindow(int[] a, int n) {
        // Write your code here
        //Window
        int[] res = new int[a.length];
        for(int i = 1 ; i<=a.length; i++){
            // sliding window
            int max =  Integer.MIN_VALUE;
            for(int j = 0; j<=a.length-i ; j++){
                //for each window find min
                int min = a[j];
                for(int k = 1 ; k<i; k++){
                    if(min>a[k+j]){
                        min = a[k+j];
                    }
                }
                if(max<min){
                    max = min;
                }
            }
            res[i-1] = max;
        }
        return res;
    }
}
