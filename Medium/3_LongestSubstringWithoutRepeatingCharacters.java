class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) 
        {
            return s.length();
        }
        int max=0,st=0,e=0;
        Set<Character> set=new HashSet<>();
        while(e<s.length())
        {
            char curr=s.charAt(e);
            while(set.contains(curr))
            {
                set.remove(s.charAt(st));
                st++;
            }      
            if(!set.contains(curr))
            {
                set.add(curr);
                e++; 
            } 
            max=Math.max(max,set.size());
        }
        return max;
    }
}
