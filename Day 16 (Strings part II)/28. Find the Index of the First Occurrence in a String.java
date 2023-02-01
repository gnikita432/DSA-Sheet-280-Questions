// 28. Find the Index of the First Occurrence in a String

//z function O(n+m)

// This is eventually n*m only but i tried impleting z function bellow is the better version of it
class Solution {
    public int strStr(String haystack, String needle) {
        // step 1: concat the haystack and needle
        String str = needle + "$" + haystack;

        // step 2: keep one pointer i at 0 and j at needle+1 index
        int i = 0, j = needle.length()+1 , count=needle.length()+2 , idx=-1;

        // step 3: loop through
        while(i< needle.length() && j< str.length()){
            char nc = str.charAt(i);
            char hsc = str.charAt(j);

            // step 4: Compare

            //if equals then move both and compares next element
            if(nc == hsc){
                i++;
                j++;
            }
            
            //if not equals then start again move i to first index and j to its second element and count will move one by one so it will be the next
            else{
                i=0;
                j = count;
                count++;
            }
          
        }
        if(str.charAt(i) == '$'){
            idx = j - 2*(needle.length())-1;
        }
       return idx;
    }
}

// Brute force O(n*m)
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

//There is also a KMP Algorithm with O(n+m) time complexity
