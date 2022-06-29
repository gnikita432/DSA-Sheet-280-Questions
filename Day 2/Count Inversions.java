// Count Inversions
// An inversion is defined for a pair of integers in the array/list when the following two conditions are met.

import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
     
      mergeSort(arr, 0 , n-1);
      return count;
    }
    
    public static long count = 0;
    public static long[] mergeSort(long[] arr, int lo, int hi){
        
        if(lo == hi){
            long[] base = new long[1];
            base[0] = arr[lo];
            return base;
        }
        
        int mid = (lo + hi)/2;
        
       long[] left = mergeSort(arr, lo, mid);
       long[] right = mergeSort(arr, mid+1, hi);
        
        long[] mergedarray = mergearray(left, right);
        
        return mergedarray;
    }
    
    public static long[] mergearray(long[] left, long[] right){
        int i=0, j=0, k=0;     
          long[] result = new long[left.length + right.length];

        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
               result[k]=left[i];
                i++;
            }else{
                count += (left.length - i);
                result[k]=right[j];
                j++;
            }
            
            k++;
        }
        while(i<left.length){
            result[k]=left[i];
            i++;
            k++;
        } 
        while(j<right.length){
            result[k]=right[j];
            j++;
            k++;
        }
        return result;
    }
    
}
  
    //O(n^2) Solution
//         long count = 0;
//         for(int i = 0 ; i< arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 if(arr[i]>arr[j]){
//                     count++;
//                 }
//             }
//         }
//         return count;
