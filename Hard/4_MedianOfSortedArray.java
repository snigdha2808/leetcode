class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        ArrayList<Integer> list=new ArrayList<Integer>();
        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        int c1[]=new int[c];
        for (int i = 0;i<a;i++) 
        { 
            c1[i] = nums1[i]; 
        }
        for (int i = 0;i<b; i++)
        {
            c1[a+i] = nums2[i]; 
        }
        for (int i = 0; i<c; i++)
        {
            list.add(c1[i]);
        }
        Collections.sort(list);
        if(c%2!=0)
        {
            return list.get(c/2);
        }
        else
        {
            return ((double)(list.get(c/2)+(double)list.get((c/2)-1)))/2.0;
        }
    }
}
