class Solution {
    public int mySqrt(int x) {
        int i=1;
        int j=x;
        int ans=0;
        if(x==0) 
            return 0;
		if(x==1) 
            return 1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(mid<=x/mid)
            {
                i=mid+1;
                ans=mid;
            }
            else
            {
                
                j=mid-1;
            }
        }
        return ans;
    }
}
