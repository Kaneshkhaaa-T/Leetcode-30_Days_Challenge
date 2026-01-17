class Solution {
    public boolean isPalindrome(int x) {

        int original = x;
        int reverse = 0;

        if(original < 0) return false;

        while(x>0){
            int mod = x%10;
            x = x/10;
            reverse = (reverse * 10) + mod;
        } 

        return original==reverse;       
        
    }
}