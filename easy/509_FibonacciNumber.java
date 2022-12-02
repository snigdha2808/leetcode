class Solution {
    public int fib(int n) {
        if(n==1)
        {
            return 1;
        }
        int a=0,b=1;
		int c=0;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
        return c;
    }
}