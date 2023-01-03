class Solution {
    public String frequencySort(String s) {
         StringBuilder sb = new StringBuilder();
         Map<Character,Integer> count=new HashMap<>();
         int n=s.length();
         for(int i=0;i<n;i++)
         {
             char ch=s.charAt(i);
             count.put(ch,count.getOrDefault(ch, 0) + 1);
          }
          count.entrySet().stream().sorted(Map.Entry.<Character,Integer>comparingByValue().reversed()).forEach(record ->
            {
                Character key = record.getKey();
                int value = record.getValue();
                for(int i = 0; i < value; i++)
                {
                    sb.append(key);
                }
            });
 
            return sb.toString();
    }
}
