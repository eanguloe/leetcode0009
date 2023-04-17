public class Solution {
    public boolean isPalindrome(int x) {
        Boolean result;
        Integer number = x;
        String numberString = number.toString();
        for (int i = 0; i < (numberString.length()/ 2); i++) {
            if (numberString.charAt(i) != numberString.charAt(numberString.length() - i -1)) {
                return false;
            }
        }
        return true;
    }
}
