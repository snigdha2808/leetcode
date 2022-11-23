class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] a=new char[s.length()];
        a=s.toCharArray();
        Arrays.sort(a);
        char[] b=new char[t.length()];
        b=t.toCharArray();
        Arrays.sort(b);
        String a1=new String(a);
        String b1=new String(b);
        int c=0;
        for(int i=0;i<b1.length();i++)
        {
            if(a1.charAt(i)!=b1.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
