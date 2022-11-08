class Solution {
    public String makeGood(String s) {
        StringBuilder str=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(j>0 && Math.abs(str.charAt(j-1)-s.charAt(i))==32)
            {
                j--;
                str.deleteCharAt(j);
            }
            else
            {
                str.append(s.charAt(i));
                j++;
            }
        }
        return str.toString();
    }
}
