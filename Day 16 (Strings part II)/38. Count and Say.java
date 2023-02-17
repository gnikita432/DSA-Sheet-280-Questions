// 38. Count and Say

class Solution {
    public String countAndSay(int n) {
        return countSay(n);
    }

    public String countSay(int count){
        // base case
        if(count==1){
            return "1";
        }
          
        String say = countSay(count-1);

        StringBuilder newsay = new StringBuilder();
        int counter = 1;
        char ch = say.charAt(0);
        for(int i = 1 ; i<say.length(); i++){
            if(say.charAt(i) == ch){
                counter++;
            }else{
                newsay.append(counter).append(ch);
                counter = 1;
                ch = say.charAt(i);
            }
        }
      
       //append any digit is left to process
        if(counter>0){
            newsay.append(counter).append(ch);
        }
        return newsay.toString();
    }
}
