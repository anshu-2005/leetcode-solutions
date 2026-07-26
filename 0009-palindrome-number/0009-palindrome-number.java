class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int rev = 0;

        while (x > rev) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        // even digits OR odd digits
        return (x == rev) || (x == rev / 10);
    }
}