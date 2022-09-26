public class Solution {
    public boolean isPalindrome(int x){
        // negative numbers cannot be a palindrome
        if(x <0){
            return false;
        }
        // this will hold the reverse value of x
        int reverse =0;
        // copy is just a copy of x
        int copy = x;

        while(copy > 0){
            // find the rightmost digit
            int digit = copy % 10;

            // append digits to reverse
            reverse = reverse * 10 + digit;

            // remove the right most digit, divide by 10
            copy /= 10;
        }
        // compare reverse to x, if they are equal, return true. Otherwise, return false
        return reverse == x;
    }
}
