class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashMap<Character, Integer>[] row=new HashMap[9];
        HashMap<Character, Integer>[] col=new HashMap[9];
        HashMap<Character, Integer>[] bimap=new HashMap[9];
        for(int i=0;i<board.length;i++)
        {
            row[i]=new HashMap<>();
            col[i]=new HashMap<>();
            bimap[i]=new HashMap<>();
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                char ch=board[i][j];
                if(ch != '.')
                {
                    row[i].put(ch,row[i].getOrDefault(ch,0)+1);
                    col[j].put(ch,col[j].getOrDefault(ch,0)+1);
                    int bi=(i/3)*3+(j/3);
                    bimap[bi].put(ch, bimap[bi].getOrDefault(ch,0)+1);
                    if(row[i].get(ch)>1 || col[j].get(ch)>1 || bimap[bi].get(ch)>1)
                    {
                        return false;
                    }
                }
            }
        }
        
        return true; 
    }
}
