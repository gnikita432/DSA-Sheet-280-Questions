// 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0 , count = 0 ;
        
        int[] arr = new int[m+n];
        
        if(n==0) return;

        while (count < (m + n)) { 
            if ( j<n && i<m && nums1[i] <= nums2[j] ){
                arr[count] = nums1[i];
                i++;
            } else if(i<m && j<n && nums1[i]>nums2[j]){
                arr[count]=nums2[j];
                j++;
            }else if(i<m){
                arr[count]=nums1[i];
                i++;
            }else if(j<n){
                arr[count] = nums2[j];
                j++;
            }
            count++;
        }
        
        for(int k=0; k<arr.length; k++){
            nums1[k] = arr[k];
        }
      
    }
}
