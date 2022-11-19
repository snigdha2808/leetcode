class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int i=0;
        while(i<columnTitle.length())
        {
            ans=ans*26+(int)(columnTitle.charAt(i)-'A'+1);
            i++;
        }
        return ans;
    }
}
