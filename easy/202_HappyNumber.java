class Solution {
    public boolean isHappy(int n) {
        int sum;
        HashSet<Integer> sett=new HashSet<Integer>();
        while(n>0)
        {
            sum=0;
            while(n>0)
            {
                int rev=n%10;
                sum+=rev*rev;
                n=n/10;
            }
            if(sum==1)
            {
                return true;
            }
            else
            {
                if(sett.contains(sum))
                {
                    return false;
                }
                sett.add(sum);
                n=sum;
            }
        }
        return false;
    }
}
