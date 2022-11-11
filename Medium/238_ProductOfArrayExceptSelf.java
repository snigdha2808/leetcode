class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] l=new int[n];
        int[] r=new int[n];
        l[0]=nums[0];
        int a=l[0];
        for(int i=1;i<n;i++)
        {
            l[i]=a*nums[i];
            a=l[i];
        }
        r[n-1]=nums[n-1];
        int b=r[n-1];
        for(int i=n-2;i>=0;i--)
        {
            r[i]=b*nums[i];
            b=r[i];
        }
        int[] arr=new int[n];
        arr[0]=r[1];
        arr[n-1]=l[n-2];
        for(int i=1;i<n-1;i++)
        {
            arr[i]=l[i-1]*r[i+1];
        }
        return arr;
    }
}
