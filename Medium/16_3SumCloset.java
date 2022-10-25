class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n-2;i++){
            int j=i+1,k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<mini)
                {
                    ans=sum;
                    mini=Math.abs(target-sum);
                }
                if(sum==target)
                {
                    return target;
                }
                else if(sum>target){
                        k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
            
    }       
}
