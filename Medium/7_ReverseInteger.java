class Solution {
    public int reverse(int x) {
        int res=0;
        while(x!=0)
        {
            int rev=x%10;
            int sum=res*10+rev;
            if((sum-rev)/10!=res)
            {
                return 0;
            }
            res=sum;
            x/=10;
        }
        return res;
    }
}
