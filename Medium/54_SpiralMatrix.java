class Solution {
    public List<Integer> spiralOrder(int[][] A) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=A.length;
        int m=A[0].length;
        int t=0,d=n-1;
        int l=0,r=m-1;
        int dir=0;
        while(t<=d && l<=r)
        {
            if(dir==0)
            {
                
            for(int i=l;i<=r;i++)
               ans.add(A[t][i]);
            t++;
            }
            else if(dir==1)
            {
                for(int i=t;i<=d;i++)
                    ans.add(A[i][r]);
                r--;
            }
            else if(dir==2)
            {
                for(int i=r;i>=l;i--)
                    ans.add(A[d][i]);
                d--;
            }
            else if(dir==3)
            {
                for(int i=d;i>=t;i--)
                   ans.add(A[i][l]);
                l++;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }
}
