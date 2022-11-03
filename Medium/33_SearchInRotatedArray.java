class Solution {
    public int search(int[] nums, int target) {
        int s=1,e=nums.length-1;
        int mid;
        int k=0;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(nums[mid]>nums[0])
            {
                s=mid+1;
            }
            else{
                k=mid;
                e=mid-1;
            }
        }
        if(binarySearch(nums,target,0,k-1) != -1) 
            return binarySearch(nums, target, 0,k-1);
        return binarySearch(nums, target,k,nums.length-1);
        
    }
    public static int binarySearch(int[] nums,int target,int s,int e)
    {
         while(s<=e){
            int mid =s+(e-s)/2;
            if(nums[mid]==target) 
                return mid;
            else if(target>nums[mid]) 
                s= mid+ 1;
            else e=mid - 1;
        }
        return -1;
    }
        
}
