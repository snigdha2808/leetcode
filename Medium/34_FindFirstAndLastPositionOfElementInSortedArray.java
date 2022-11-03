class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int[] arr={-1,-1};
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(nums[mid]==target)
            {
                arr[0]=mid;
                e=mid-1;
            }
            else if(nums[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        s=0;e=nums.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(nums[mid]==target)
            {
                arr[1]=mid;
                s=mid+1;
            }
            else if(nums[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return arr;
    }
}
