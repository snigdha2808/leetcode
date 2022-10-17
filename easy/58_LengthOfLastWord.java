class Solution {
    public int lengthOfLastWord(String s) {
        int sum=0;
        s=s.trim();
        for(int i=s.length()-1; i>=0 && s.charAt(i)!=' '; i--)
        {
            sum++;
        }
        return sum;
    }
}
