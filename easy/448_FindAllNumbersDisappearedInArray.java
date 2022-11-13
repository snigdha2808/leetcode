class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++)
            {
            set.add(nums[i]);        
            }
            for(int j=1;j<=nums.length;j++)
            {
            if(!set.contains(j))
                    arr.add(j);
            }
        return arr;
    }
}
