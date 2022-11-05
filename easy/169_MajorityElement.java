class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        int maxi=-1;
        int a=-1;
        for (int i=0;i<n;i++)
        {
            if (visited[i]==true)
            {
                continue;
            }
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    visited[j]=true;
                    c++;
                }
            }
            maxi=Math.max(maxi,c);
            {
                if(maxi>(n/2))
                {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
