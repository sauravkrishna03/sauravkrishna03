class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0;int rev = 0;int b = x;
        boolean a = false;
        while (b != 0) {
            rem = b % 10;
            rev = rev * 10 + rem;
            b = b / 10;
        }
        if(x < 0){
            a = false;
        }
        else if(rev == x){
            a = true;
        }
        return a;
    }
}