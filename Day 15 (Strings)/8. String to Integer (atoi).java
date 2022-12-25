// 8. String to Integer (atoi)

class Solution {
    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        long intValue = 0;
        int index = 0;
        boolean isNegative = false;
        // ignore leading spaces
        while (index<str.length() && str.charAt(index) == ' ') {
            index++;
        }
        // check sign
        if (index<str.length() && 
                     (str.charAt(index) == '-' || str.charAt(index) == '+')) {
            isNegative = (str.charAt(index) == '-');
            index++;
        }
        while (index<str.length()) {
            char c = str.charAt(index);
            int digit = c - '0';
            // validate
            if (digit < 0 || digit > 9) { // all digits are in the range of 0 to 9
                break;
            }
            // compute value
            intValue = intValue*10 + digit;
            // handle overflow
            if (intValue > Integer.MAX_VALUE) {
                intValue = isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                break;
            }
            index++;
        }
        if (isNegative) {
            intValue *= -1;
        }
        return (int)intValue;
    }
}
