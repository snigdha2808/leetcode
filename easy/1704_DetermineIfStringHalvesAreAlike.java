class Solution {
    public boolean halvesAreAlike(String s) {
       int len=s.length();
        int i=0,j=len/2;
        Set<Character> set=Set.of('a','e','i','o','u','A','E','I','O','U');
        int a=0,b=0;
        while(j<len)
        {
            if(set.contains(s.charAt(i++)))
            {
                a++;
            }
            if(set.contains(s.charAt(j++)))
            {
                b++;
            }
        }
        return a==b; 
    }
}
