class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length-1;
        for(int i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
            }
            if(nums[len]!=nums[len-1] )
            {
                return nums[len];
            }
        }
        return nums[0];
    }
}
