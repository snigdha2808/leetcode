class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
        {
            return false;
        }
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,h=(n*m)-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(matrix[mid/m][mid%m]==target)
            {
                return true;
            }
            if(matrix[mid/m][mid%m]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return false;
    }
}
