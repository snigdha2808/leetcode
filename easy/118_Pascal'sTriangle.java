class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> r,pre=null;
		for(int i=0;i<numRows;++i)
        {
			r=new ArrayList<Integer>();
			for(int j=0;j<=i;++j)
				if(j==0 || j==i)
					r.add(1);
				else
					r.add(pre.get(j-1)+pre.get(j));
			pre=r;
			res.add(r);
		}
		return res;
    }
}
