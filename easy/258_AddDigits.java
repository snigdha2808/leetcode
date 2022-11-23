class Solution {
    public int sumOfDigit(int n) 
    {
        int sum=0 ;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int addDigits(int num)
    {
        while(num>=10)
        {
            num=sumOfDigit(num);
        }
        return num;
    }
}
