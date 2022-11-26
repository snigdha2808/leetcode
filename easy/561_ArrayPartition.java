class Solution {
    public int arrayPairSum(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums) list.add(num);
        Collections.sort(list);
        int ans=0;
        for(int i=0;i<nums.length;i+=2) ans+=list.get(i);
        return ans;
    }
}
