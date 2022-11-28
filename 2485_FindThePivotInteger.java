class Solution {
    public int pivotInteger(int n) {
        int sum=0,lsum=0,rsum=0;
        sum=(n*(n+1))/2;
        for(int i=1;i<=n;i++)
        {
            lsum+=i;
            rsum=sum-lsum+i;
            if(lsum==rsum)
            {
                return i;
            }
        }
        return -1;
    }
}
