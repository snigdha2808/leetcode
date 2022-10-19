class Solution {
    public boolean exist(char[][] board, String lett) {
        for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[0].length;j++)
			{
				if(board[i][j]==lett.charAt(0))
				{
					boolean ans=Search(board,i,j,lett,0);
					if(ans==true)
					{
						System.out.println(ans);
						return ans;
					}
				}
			}
        }
        return false;
    }
    public static boolean Search(char[][] board,int cr,int cc,String lett,int idx)
	{
		if(idx==lett.length()) {
			return true;
		}
		if(cr<0 || cc<0 || cr>=board.length || cc>=board[0].length || board[cr][cc]!= lett.charAt(idx))
			return false;
		board[cr][cc]='*';
		int[] r= {-1,1,0,0};
		int[] c= {0,0,1,-1};
		for(int i=0;i<c.length;i++)
		{
			boolean ans=Search(board,cr+r[i],cc+c[i], lett,idx+1);
			if(ans==true)
			{
				return ans;
			}
		}
		board[cr][cc]=lett.charAt(idx);
		return false;
	}
}
