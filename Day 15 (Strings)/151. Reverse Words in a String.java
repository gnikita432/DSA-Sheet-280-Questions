// 151. Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        
        int i = 0 , j = 0;
        String word = "", res = "";
        while(i<s.length() && j<s.length()){
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            if(i >= s.length()){
                break;
            }
            j = i+1;
            while(j<s.length() && s.charAt(j)!=' '){
                j++;
            }
            word = s.substring(i, j);
            res = res.length()==0? word : word +" "+ res;
            i = j+1;
        }
        return res;
    }
}
