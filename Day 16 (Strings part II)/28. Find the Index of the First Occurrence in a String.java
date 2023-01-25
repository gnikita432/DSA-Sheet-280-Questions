// 28. Find the Index of the First Occurrence in a String

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int idx = -1;
        int j = 0;
        for(int i = 0 ; i<haystack.length()-needle.length() +1; i++){
          while(j<needle.length()){    
                char nch = needle.charAt(j);
                char hsch = haystack.charAt(i+j);
                if(nch == hsch){
                   j++;
                }
                else{
                    j=0;
                    break;
                }
            }
            if(j==needle.length()){
                  idx = i;
                  break;
            }  
        }
        return idx;
    }
}
