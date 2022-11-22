class Solution {
    public char findTheDifference(String s, String t) {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        char b[]=t.toCharArray();
        Arrays.sort(b);
        String a1=new String(a);
        String b1=new String(b);
        for(int i=0;i<a1.length();i++)
        {
            if(a1.charAt(i)!=b1.charAt(i))
                    return b1.charAt(i);
        }
        return b1.charAt(a1.length());
    }
}
