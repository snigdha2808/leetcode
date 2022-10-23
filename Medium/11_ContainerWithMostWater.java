class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int max1=0;
        while(s<e)
        {
            int b=e-s;
            int l=Math.min(height[s],height[e]);
            int area=l*b;
            max1=Math.max(max1,area);
            if(height[s]<height[e])
                s++;
            else if(height[s]>height[e])
                e--;
            else {
                s++;
                e--;
            }
        }
        return max1;
    }
}
