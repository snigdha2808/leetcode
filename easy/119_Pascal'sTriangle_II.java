class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> r,pre=null;
        List<Integer>ro =new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++)
        {
            r=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    r.add(1);
                }
                else
                {
                    r.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre=r;
            ro=r;
        }
        return ro;
    }
}
