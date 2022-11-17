class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area=(ay2-ay1)*(ax2-ax1)+(bx2-bx1)*(by2-by1);
        if(ay1>=by2 || by1>=ay2 || bx1>=ax2 || ax1>=bx2)
        {
            return area;
        }
        int a=Math.min(by2,ay2)-Math.max(ay1,by1);
        int b=Math.min(ax2,bx2)-Math.max(ax1,bx1);
        area=area-(a*b);
        return area;
    }
}
