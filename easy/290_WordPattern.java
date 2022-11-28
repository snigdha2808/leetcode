class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<Character,String>();
        Set<String> set=new HashSet<String>();
        String[] words=s.split(" ");
        if(words.length!=pattern.length())
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if (map.containsKey(c))
            {
                if (!words[i].equals(map.get(c)))
                {
                    return false;
                }
            } 
            else
            {
                map.put(c, words[i]);
                if (set.contains(words[i]))
                {
                    return false;
                } 
                else 
                {
                    set.add(words[i]);
                }
            }
        }
        return true;
    }
}
