class Solution {
    public boolean isPalindrome(int x) {
        int cpy=x;
        int rev=0,sum=0;
        while(x>0)
        {
            rev=x%10;
            sum=(sum*10)+rev;
            x=x/10;
        }
        if(cpy==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
