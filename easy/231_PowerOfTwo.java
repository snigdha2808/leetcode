class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        {
            return true;
        }
        while(n>0)
        {
            int rem=n%2;
            if(rem==1)
            {
                return false;
            }
            if(n==2 )
            {
                return true;
            }
            n = n/2;
        }
        return false;
    }
}
