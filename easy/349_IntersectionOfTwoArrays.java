class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        Set<Integer> set=new HashSet<>();
        Set<Integer> nSet=new HashSet<>();
        for(int i=0;i<m;i++)
        {
            set.add(nums1[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(set.contains(nums2[i]))
            {
                nSet.add(nums2[i]);
            }
        }
        int[] res=new int[nSet.size()];
        int i=0;
        for(Integer num:nSet)
        {
            res[i++] =num;
        }
        return res;
    }
}
