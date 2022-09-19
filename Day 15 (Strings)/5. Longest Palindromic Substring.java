// 5. Longest Palindromic Substring

class Solution {

     // 2. EXPANDING Around The Corners Here I am checking that if a string is palindrome or not and if string is alredy palindrome then I am simly expanding it to see if that is too palindrome or not that is i-- j++ and if it is not palindromic then therre is no sens in further expanding it more so I am simply trying other comibinations by incring i
    public String longestPalindrome(String s) {
       
        int i = 0, j = 0, len = 0 ;
        String ans = "";
        while(i<s.length() && i>=0 && j<s.length()){
            String sstr = s.substring(i, j+1);
            
            //Palindromic normal check - yes
            if(s.charAt(i) == s.charAt(j)){
                //confirmed palindromic check - yes
                if(palindrome(sstr)){
                    int temp = j+1 - i;
                    if(temp>len){
                        len = temp;
                        ans = sstr;
                    }
                    if(i>0){
                        i--;
                        j++;
                    }else{
                        j++;
                    }
                }
                
                //confirmed palindromic check - no
                else{
                    i++;
                }
            }
            // confirmed non palndromic string
            else{
                i++;
            }
        }
        return ans;
    }
     public boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

// 1. Find out all substrings and then check for the longest palindrome in that. -TLE
//  public String longestPalindrome(String s) {
        
//         int len = 0;
//         String ans = "";

//         for(int i = 0 ; i<s.length() ; i++){
//             for(int j = i ; j< s.length(); j++){
//                String str = s.substring(i, j+1);
//                 if(palindrome(str)){
//                     int temp = j+1 - i;
//                     if(temp>len){
//                         len = temp;
//                         ans = str;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
    
//     public boolean palindrome(String s){
//         int i = 0;
//         int j = s.length()-1;
//         while(i<j){
//             if(s.charAt(i)!= s.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
