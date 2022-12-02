class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxarea=0;
        for(int i=0;i<heights.length;i++)
        {
            while(!st.isEmpty() && heights[i]<heights[st.peek()])
            {
                int h=heights[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    maxarea=Math.max(maxarea,h*r);
                }
                else
                {
                    int l=st.peek();
                    maxarea=Math.max(maxarea,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=heights.length;
        while(!st.isEmpty())
        {
            int h=heights[st.pop()];
            if(st.isEmpty())
            {
                maxarea=Math.max(maxarea,h*r);
            }
            else 
            {
				int l=st.peek();
				maxarea=Math.max(maxarea,h*(r-l-1));
			}
        }
        return maxarea;
    }
}
