class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(t-nums[i])){
                return new int[]{map.get(t-nums[i]),i};
            }
            else
                map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
