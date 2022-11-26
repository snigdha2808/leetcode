class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String,List<String>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(!map.containsKey(s))
                map.put(s,new ArrayList<String>());
            map.get(s).add(strs[i]);
        }
        
        List<List<String>> anagramGroups = new ArrayList<List<String>>();
        anagramGroups.addAll(map.values());        
        return anagramGroups;
    }
}
