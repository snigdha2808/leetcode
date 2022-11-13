class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            c++;
            if(nums[i]==0)
            {
                c=0;
            }
            a=Math.max(a,c);
        }
        return a;
    }
}
