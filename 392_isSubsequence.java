class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)  return true;
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(t.charAt(j)==s.charAt(i))
            {
                i++;
            }
            j++;
        }
        if(i!=s.length())
            return false;
        return true;
    }
}
